package com.ohgiraffers.section03.increment;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. 단항 연산자이자 증감연산자에 대해 이해하고 활용할 수 있다. */
        int num = 20;
        System.out.println("num = " + num);

        num++;          //후위 연산자
        System.out.println("num = " + num);

        ++num;          //전위 연산자
        System.out.println("num = " + num);

        num--;
        System.out.println("num = " + num);

        --num;
        System.out.println("num = " + num);

        int firstNum = 20;
        int result = firstNum++ + 3;
        System.out.println("result = " + result);           // 23
        System.out.println("firstNum = " + firstNum);       // 21
        System.out.println("firstNum++ = " + firstNum++);   // 21
        System.out.println("firstNum = " + firstNum);       // 22


    }
}
