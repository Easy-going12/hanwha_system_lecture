package com.ohgiraffers.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        /* ContextConfiguration으로 설정한 내용을 바탕으로 IOC 컨테이너 생성 */
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        // ContextConfiguration class에 따로 설정한 부분이 없더라도 기본적으로 생성되는 설정 파일들이 존재하고 기본적으로 메소드 명을
        // 호출한다.
        String[] beanNames = context.getBeanDefinitionNames();
        for(String beanName : beanNames){
            System.out.println("beanName: " + beanName);
        }

    }
}
