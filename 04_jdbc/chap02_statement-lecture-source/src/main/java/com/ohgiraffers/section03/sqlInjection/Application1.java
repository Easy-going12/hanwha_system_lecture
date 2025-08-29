package com.ohgiraffers.section03.sqlInjection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    private static String empId = "200";
    private static String empName = "' OR 1=1 AND EMP_ID = '200";

    public static void main(String[] args) {
        Connection con = getConnection();
        Statement stmt = null;
        ResultSet rset = null;

        // 아이디, 비번에 쿼리문을 입력하여 해당 값이 true가 될 경우 통과되 접속한 아이디, 비번이 털릴 수도 있다.
//        String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID = '200' AND EMP_NAME = '' OR 1=1 AND EMP_ID = '200';
        String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID = '" + empId
                + "' AND EMP _NAME = '" + empName + "'";

        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery(query);

            if(rset.next()){
                System.out.println(empId + "사번 "
                        + rset.getString("EMP_NAME") + " 조회 완료!");
            } else{
                System.out.println("해당 사원이 없습니다.");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(rset);
            close(stmt);
            close(con);
        }
    }
}
