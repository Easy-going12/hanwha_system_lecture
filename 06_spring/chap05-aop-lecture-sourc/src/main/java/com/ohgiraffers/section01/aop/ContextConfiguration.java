package com.ohgiraffers.section01.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.ohgiraffers.section01.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)    // Proxy 기술 활성화 하기 위해서 필요
public class ContextConfiguration {
}
