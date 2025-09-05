package com.ohgiraffers.section01.autowired.subsection02.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        // 기존의 BookService로 하면 이름이 겹치기 때문에 이름으로 지정해야한다.
        BookService bookService = context.getBean("setterService", BookService.class);
        System.out.println("bookService = " + bookService);

        bookService.findAllBook();
    }
}
