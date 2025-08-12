package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_test {
    public void testNestdeIFElseStatement() {

        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름을 입력하세요: ");
        String name = sc.next();
        System.out.print("학생의 점수를 입력해 주세요: ");
        int score = sc.nextInt();
        String rate2;

        if(score >= 90) {
            if(score >= 95) {
                rate2 = "A+";
            }else{
                rate2 = "A";
            }
        }else if(score >= 80) {
            if(score >= 85) {
                rate2 = "B+";
            }else {
                rate2 = "B";
            }
        }else if(score >= 70) {
            if(score >= 75) {
                rate2 = "C+";
            }else{
                rate2 = "C";
            }
        }else if(score >= 60) {
            if(score >= 65){
                rate2 = "D+";
            }else{
                rate2 = "D";
            }
        }else{
            rate2 = "F";
        }

        System.out.println(name + " 학생의 점수는 " + score + "점이고, 등급은 " + rate2 + "입니다.");


    }
}
