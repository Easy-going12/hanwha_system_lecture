package com.ohgiraffers.section01.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    /* 설명. 포인트 컷을 따로 메소드로 빼내는 작업 */
    @Pointcut("exeution(* com.ohgiraffers.section01.aop.*Service.*(..))")
    public void logginAspect() {
    }

//    @Before("exeution(* com.ohgiraffers.section01.aop.*Service.*(..))")
    @Before("LoggingAspect.loggingAspect()")      // 포인트 컷을 할 부분 지정 간략하게 표현
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before Advice 동작");
    }
}
