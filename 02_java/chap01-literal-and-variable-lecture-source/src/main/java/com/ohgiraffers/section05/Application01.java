package com.ohgiraffers.section05;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 자동현변환 규칙에 대해 이해할 수 있다.*/
        byte bNum = 1;          // byte에 대입되는 정수는 처음부터 byte형으로 인지
        short sNum = (short)bNum;
        int iNum = sNum;

        int num1 = 10;
        long num2 = 20L;         // 20이 long 형으로 up casting이 일어남

        long result = num1 + num2;


        /* 설명. char형을 int형에 담으면 유니코드 번호를 확일할 수 있다. */
        int uniNum = 'f';
        System.out.println("uniNum: " + uniNum);
        System.out.println("uniNum= " + uniNum);        // soutv(변수 출력)
    }
}
