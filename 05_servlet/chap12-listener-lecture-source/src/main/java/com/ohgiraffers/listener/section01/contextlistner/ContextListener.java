package com.ohgiraffers.listener.section01.contextlistner;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
// 값을 필수적으로 넣을 필요 없는 추상 클래스로 구성되어졌다.
public class ContextListener implements ServletContextListener, ServletContextAttributeListener {
    public ContextListener() {
        System.out.println("Context listener 인스턴스 생성!");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context init!!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context destroy!!");
    }

    // 서버에서 로그인 처리할 때 가장 많이 사용된다.
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("attribute add!!" + event.getName());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("attribbute remove!!");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("attribute replaced!");
    }
}
