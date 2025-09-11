package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Application {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";

        /* 설명. JDBC에서의 Connection 객체 같은 개념 */
        SqlSession session = null;

        try {
            // resource 설정 파일에 있는 값을 가져오는 역할
            InputStream inputStream = Resources.getResourceAsStream(resource);

            // Mybatis를 사용하기 위한 그릇(공장) 생성
            // 이 때 어느 쿼리문을 어느 경로로 가져올지 미리 가져온 설정파일 resource에 저장되어 잇는 상태
            SqlSessionFactory sqlSessionFactory =
                    new SqlSessionFactoryBuilder().build(inputStream);

            //DB에서 쿼리문 가져오겠다는 선언
            session = sqlSessionFactory.openSession(false);     // false를 주어야 수동 커밋 가능

            java.util.Date nowDate = session.selectOne("mapper.selectNow");
            System.out.println("nowDate = " + nowDate);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            session.close();
        }
    }
}
