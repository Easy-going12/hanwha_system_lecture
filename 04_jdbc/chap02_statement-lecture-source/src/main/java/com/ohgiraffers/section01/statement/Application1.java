package com.ohgiraffers.section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {

        // main 구문을 트랙잭션 단위라고 생각하면 된다.
        Connection con = getConnection();
        System.out.println("con = " + con);         // DB와의 연동 확인

        Statement stmt = null;                      // SQL 및 쿼리 실행 결과를 싣고 DBMS 오기는 트럭같은 개념
        ResultSet rset = null;                      // 쿼리(SELECT)의 결과(JAVA의 타입)
        // Connection -> Statement -> ResultSet 순서대로 열였으면 반대 순서대로 close()을 해야하지만 마지막에 프로그램이 종료되서
        // 상관이 없다.

        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery("SELECT * FROM EMPLOYEE");

            /* 설명. 다중행 조희 결과를 반복하며 추출 */
            while(rset.next()){
                // DB에서 데이터를 꺼낼 때, java 타입에 맞춰서 꺼내기 위해서 getString과 같이 타입을 표시한다.

                /* 설명. 반복문 안에서는 단일행을 하나하나 컬럼별로 꺼내온다. */
                System.out.println(rset.getString("EMP_NAME") + ", " + rset.getInt("SALARY"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{

            /* 설명. 코드의 줄 수를 줄이고 가독성을 높이기 위해 모듈화 */
            close(rset);
            close(stmt);
            close(con);

        }
    }
}
