package com.ohgiraffers.section05;

public class Application02 {
    public static void main(String[] args) {
        /* 수업목표. 강제 형변환 규칙에 대해 이해할 수 있다. */
        /*설명.
         *  강제 형변환
         *  : 바꾸려는 자료형으로 캐스팅 연산자를 이용하여 형변환한다.
         * */
        long lNum = 80000000000L;
        int inNum = (int)lNum;
        System.out.println("iNum =" + inNum);

        /* 설명. 실수 값을 정수형 자료형으로 강제 형변한 하면 소수점 아래가 소실된다.*/
        float avg = 31.235f;
        int floorNum = (int)avg;
        System.out.println("floorNum =" + floorNum);
    }
}
