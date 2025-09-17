package com.ohgiraffers.section02.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

public class EntityManagerCRUDTest {
    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeAll
    public static void initFactory(){
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");
    }

    @BeforeEach
    public void initManager(){
        entityManager = entityManagerFactory.createEntityManager();
    }

    @AfterEach
    public void closeManager(){
        entityManager.close();
    }

    @AfterAll
    public static void closeFactory(){
        entityManagerFactory.close();
    }

    @Test
    public void 메뉴코드로_메뉴_조회_테스트() {
        int menuCode = 2;

        // 해당 코드에 대한 내용이 없을 경우 DB에 가서 조회한다.
        // 마지막 자리(menuCode) 부분은 PK 값만 넣어야한다.
        /* 설명. entityManager를 통해 여러번 find를 해도 select은 한번만 동작한다.(feat. DB I/O 횟수 줄임) */
        Menu foundMenu = entityManager.find(Menu.class, menuCode);
        Menu foundMenu2 = entityManager.find(Menu.class, menuCode);

        /* 설명. 단정문은 두 개 이상 가능하며 동일성 보장 확인 */
        Assertions.assertNotNull(foundMenu);
        Assertions.assertEquals(foundMenu, foundMenu2);     // jap는 동일성을 보장한다.
        System.out.println("foundMenu = " +  foundMenu);
    }

    @Test
    public void 새로운_메뉴_추가_테스트(){

        //비영속 상태. 아직 매니저에게 데이터를 보내기 전 단계
        Menu menu = new Menu();
        menu.setMenuName("꿀발린추어탕");
        menu.setMenuPrice(7000);
        menu.setCategoryCode(4);
        menu.setOrderableStatus("Y");

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

//        entityManager.persist(menu);    // 영속상태로 바꿈
//        transaction.commit();

        try{
            entityManager.persist(menu);
            transaction.commit();
        }catch(Exception e){
            transaction.rollback();
        }
    }

    @Test
    public void 메뉴_이름_수정_테스트(){
        /* 설명. 43번 메뉴 엔티티를 영속 상태로 만들어 받은 다음 */
        Menu menu = entityManager.find(Menu.class, 43);
        //PK 값에 해당하는 데이터가 없으면 DB에서 해당 값을 가져와서 영속상태로 바꾼다.

        String menuNameToChange = "갈치스무디";

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try{
            menu.setMenuName(menuNameToChange);
            transaction.commit();
        }catch(Exception e){
            transaction.rollback();
        }
    }

    @Test
    public void 메뉴_삭제하기_테스트(){

        Menu menuToRemove = entityManager.find(Menu.class, 43);

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try{
            entityManager.remove(menuToRemove);
            transaction.commit();
        }catch(Exception e){
            transaction.rollback();
        }
    }
}
