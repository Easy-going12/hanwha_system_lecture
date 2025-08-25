package com.ohgiraffers.section02.openclosed.problem;

public class BadPaymentProcessor {
    public void processPayment(String paymentType) {
        if(paymentType.equals("credit")){
            System.out.println("신용카드로 결제를 처리합니다.");
        } else if(paymentType.equals("kakao")){
            System.out.println("카카오페이로 결제를 처리합니다.");
        }
    }
}
