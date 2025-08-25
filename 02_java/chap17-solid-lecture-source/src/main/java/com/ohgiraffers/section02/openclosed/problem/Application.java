package com.ohgiraffers.section02.openclosed.problem;

/*  설명.
 *   개방-폐쇠 원칙(Open-Closed Principle) - "확장할 때 기존 코드를 수정하며 확장되면 안돼!"
 *   - 소프트웨어의 엔티티(클래스, 모듈, 함수 등)는 확장에 대해서 열려 있어야 하지만,
 *     변경에 대해서는 닫혀 있어야 한다.
* */

public class Application {
    public static void main(String[] args) {
        BadPaymentProcessor badPaymentProcessor = new BadPaymentProcessor();
        badPaymentProcessor.processPayment("credit");   // 신용카드 결제
        badPaymentProcessor.processPayment("kakao");    // 카카오페이 결제
        // 결제 방법을 늘리기 위해서는 기존의 방법을 잠시 죽이고 만들어야 한다. 다른 결제 방식에 영향을 줄 수 있기 때문이다.

        /* 설명. 새로운 결제 수단을 추가하려면 결제 관련 모드 코드가 있는 이 클래스를 수정해야 한다. */
    }
}
