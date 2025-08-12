package com.ohgiraffers.section02.variable;

public class Application02 {
    public static void main(String[] args) {
        /* 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다.(feat. 자료형(tpye)) */
        /* 목차. 1. 점수를 취급하는 자료형 */
        byte bNum;          // 1byte
        short sNum;         // 2byte
        int iNum;           // 4byte
        long lNum;          // 8byte

        /* 목차. 2. 실수를 취급하는 자료형 */
        float fNum;         // 4byte
        double dNum;        // 8byte

        /* 목차. 3. a문자를 취급하는 자료형 */
        char ch;            // 2byte

        /* 목차. 4. 논리값을 취급하는 자료형 */
        boolean isTrue;     // 1byte

        /* 목차. 5. 추가로, 문자열을 취급하는 자료형(기본자료형 X) */
        String str;         // 4byte

        /* 설명. 각 변수에 값 대입해 보자 */
        bNum = 1;
        sNum = 2;
        iNum = 215000000;
        lNum = 215000000L;

        fNum = 3.14f;        // double형 값(실수 값을 기본 인지)을 float 형 변수에 담을려나 컴파일 발생
        dNum = -3.14;

        ch = 'a';
        ch = 97;

        isTrue = true;

        /* 설명. 변수를 활용한 합계(sum), 평균(avg) 출력해보기 */
        int kor = 98;
        int eng = 80;
        int mat = 75;

        int sum = kor + eng + mat;
        System.out.println("합계:" + sum);

        double avg = sum / 3.0;
        System.out.println("평균:" + avg);
    }
}
