package com.ohgiraffers.section02.prepared;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {
        Connection con = getConnection();

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        try {
            //stmt랑 다르게 이미 준비된 객체 형태가 존재한다. 하지만 이미 완성된 상태는 이전 Statement랑 다르지 않다.
            pstmt = con.prepareStatement("SELECT EMP_ID, EMP_NAME FROM EMPLOYEE");
            rset = pstmt.executeQuery();

            while(rset.next()) {
                System.out.println(rset.getString("EMP_ID") + "사번의"
                + rset.getString("EMP_NAME") + "사원");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            close(rset);
            close(pstmt);           // PrepareStateeMent는 Statement의 자식 클래스라 다형성에 의해 기존 close() 활용 가능
            close(con);
        }
    }
}
