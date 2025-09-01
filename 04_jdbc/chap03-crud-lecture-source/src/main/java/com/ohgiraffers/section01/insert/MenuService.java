package com.ohgiraffers.section01.insert;

import java.sql.Connection;
import java.sql.SQLException;

import static com.ohgiraffers.common.JDBCTemplate.*;

// Service는 하나의 트랜잭션의 실행 단위이다. Repository와ㅏ 연결하는 역할을 하는 거 다시 한 번 기억하자
/* 설명. Service 계층은 Connection 객체 생성 및 소멸(하나의 트랜잭션 단위) 및 비지니스 로직(한번에 처리되는 단위),
        트랜잭션 처리(commit/rollback)를 담당 */
public class MenuService {
    public void registMenu(Menu menu) {
        Connection con = getConnection();

        MenuRepository repository = new MenuRepository();
        int result = repository.insertMenu(menu, con);

        /* 설명. DML 작업은 기본적으로 트랜잭션당 하나의 DML 작업이더라도 성공/실패에 대한 로직 작성 */
        if(result == 1){

            /* 설명. insert 성공 시 commit */
            commit(con);

        } else{

            /* 설명. insert 실패 시 rollback */
            rollback(con);
        }

        close(con);

    }
}
