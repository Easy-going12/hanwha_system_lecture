package com.ohgiraffers.section05.dependencyinversion.resolved;

public class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS3 발송: " + message);
    }
}
