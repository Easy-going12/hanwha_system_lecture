package com.ohgiraffers.section03.map.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. Properties에 대해 이해하고 활용할 수 있다. */
        /* 설명. Properties -> XML -> Annotation -> yml(yaml) */
        // 외부 리소스와 파일 입출력하기에는 편리하다.
        Properties prop = new Properties();
        prop.setProperty("driver","oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url","jdbc:oracle:thin:@localhost:1521:xe");
        prop.setProperty("user","swcamp");
        prop.setProperty("password","swcamp");

        System.out.println("prop = " + prop);

        try{
            prop.store(new FileOutputStream("driver.dat"),"jdbc driver");
//            prop.storeToXML(new FileInputStream("driver.xml"));
        }catch (IOException e){
            throw new RuntimeException();
        }

        Properties prop2 = new Properties();
        System.out.println("읽어오기 전: " + prop2);

        try {
            prop2.load(new FileInputStream("driver.dat"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("===== 읽어와 담긴 값 =====");
        System.out.println("드라이버: " + prop2.getProperty("driver"));
        System.out.println("경로: " + prop2.getProperty("url"));
        System.out.println("아이디: " + prop2.getProperty("user"));
        System.out.println("비밀번호: " + prop2.getProperty("password"));
    }
}
