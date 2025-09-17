package com.ohgiraffers.section01;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

public class EntityManagerLifeCycleTest {

    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeAll
    public static void initFactory(){
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");
    }

    @BeforeEach
    public void initManager(){

        /* 설명. EntityManager가 새성될 때마다 고유의 새로운 영속성 컨텍스트(Entity 객체를 관리하는 창고)가 생성된다. */
        entityManager = entityManagerFactory.createEntityManager();
        // 회사에 파견나가는 직원 즉 파견 나가는 회사(DB) 정보를 알고 있는 사원
        // 이 때 어떤 속성을 가져올지 정하는 부분이 있어야 서류 가방(엔티티)까지 챙겨 나간다.
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
    public void 엔티티_매니저_팩토리와_엔티티_매니저_생명주기_확인1(){
        System.out.println("entityManagerFactory.hashCode1: " + entityManagerFactory.hashCode());
        System.out.println("entityManager.hashCode1: " + entityManager.hashCode());
    }

    @Test
    public void 엔티티_매니저_팩토리와_엔티티_매니저_생명주기_확인2(){
        System.out.println("entityManagerFactory.hashCode2: " + entityManagerFactory.hashCode());
        System.out.println("entityManager.hashCode2: " + entityManager.hashCode());
    }
}
