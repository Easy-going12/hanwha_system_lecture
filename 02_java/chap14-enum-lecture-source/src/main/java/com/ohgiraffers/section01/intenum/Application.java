package com.ohgiraffers.section01.intenum;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 단순 정수 열거 패턴과 이러한 패턴의 단점을 이애할 수 있다.(enum아닐 때) */
        int subject1 = Subject.JAVA;
        int subject2 = Subject.HTML;

        /* 설명. 1. 둘 다 같은 상수이자 숫자일 뿐 구분할 수 없다.(런타임 시점) */
        if(subject1 == subject2){
            System.out.println(" 두 과목은 같은 과목이다.");
        }

        /* 설명. 2. 변수명에 쓰인 이름(과목명)을 충분히 활용할 수 없다.(숫자로만 처리되기 때문) */
        // 필드면으로 활용하지 못하고 숫자로만 구분하는건 효율이 좋지 않다.
        Scanner sc = new Scanner(System.in);
        System.out.println("과목 번호를 입력하세요:(0~2): ");
        int fieldNO = sc.nextInt();


        String subName = "";
        switch(fieldNO){
            case Subject.JAVA: subName = "JAVA"; break;
            case Subject.MARIADB: subName = "MARIADB"; break;
            case Subject.JDBC: subName = "JDBC"; break;
        }

        System.out.println("선택한 과목명은: " + subName + "입니다.");

        /* 설명. 3. 같은 클래스에 속한 상수들을 순회(반복자/반복문)할 수 없다.
         *         (필드가 총 몇개이고 어떤 것들이 있는지)
        * */
        // 숫자들을 활용할 경우 JAVA 안에 정확한 필드 개수를 확인 못하는 것을 숫자가 중복되기때문이다.

        /* 설명. 4. 타입안정성을 보장할 수 없다. */
        printSubject(Subject.JAVA);
        printSubject(10);
        // 원래라면 과목명을 넣어야 동작되도록 해야하는데 숫자만 넣어도 작동되도록 되어 버린다.
    }

    private static void printSubject(int java) {
    }
}
