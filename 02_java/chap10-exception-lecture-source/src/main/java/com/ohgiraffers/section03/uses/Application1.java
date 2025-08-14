package com.ohgiraffers.section03.uses;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 예외처리를 많이 사용하는 io패키지와 관련된 try-catch 구문을 이해할 수 있다. */
        /* 설명.
         *  예외 처리를 가장 많이 사용하게 되는 상황(io 패키지 관련)에서 try-catch 구문을 실제 상황과
         *  유사하게 사용해 보자.
         *    (아직 배우지 않았으니 입출력 관련 구문을 하나하나를 신경쓰기 보다 전체 흐름과 구조에 신경쓰기.)
        * */

        System.out.println(new File("test.dat").getAbsolutePath());
        // "test.dat"는 파일이름이 아닌 경로에 잇는 파일을 객체로 취급한다. getAbsolutePath는 객체로 취급밥는 파일의 절대경로를 찾아낸다.

        BufferedReader br = null;


        try {
            br = new BufferedReader(new FileReader(new File("test1.dat")));
            // 오류
            // 실행
            //이 부분 오류
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {

            /* 설명.
             *  예외처리 구문과 상관없이 반드시 수행해야 하는 경우 finally에 작성하는데
             *  보통 사용한 자원(resource)를 반납하는 용도로 사용하게 된다.
            * */
            try {

                /* 설명.
                 *  임출력에서 사용한 스트림(통로)을 닫아주는 용도의 메소드
                 *  NPE를 신경써야 된다.
                * */
                if(br!= null) br.close();   // NPE 방지 코드(코틀린 언어에서 많이 사용된다)
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
