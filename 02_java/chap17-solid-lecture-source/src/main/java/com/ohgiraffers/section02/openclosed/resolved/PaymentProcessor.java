package com.ohgiraffers.section02.openclosed.resolved;

public class PaymentProcessor {
    // 인터페이스에 의존한다. 인터페이스가 변경되거나 카드 클래스의 내용이 변하더라도 다른 클래스의 영향 없이 호출 가능하다.
    public void processPayment(Payment payment) {
        payment.process();
    }
}
