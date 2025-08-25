package com.ohgiraffers.setion03.additional;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdditionAnnotationTest {

    /* 수업목표. Junit에서 제공하는 메소드 간련 추가 이노테이션을 사용할 수 있다 */
    @Test
    @Disabled
    public void testIgnore(){}

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)    // 1초 타임아웃 체크 시
    public void testTimeout() throws InterruptedException {
//        Thread.sleep(900);        // 0.9초 시간지연 발행!
        Thread.sleep(1001);
    }

    /* 설명. 테스트 클래스에 @TestMethodOrder 어노테이션을 추가해서 낮은 숫자가 먼저 동작하게 테스트 코드 작성 */
    @Test
    @Order(1)
    public void testFirst() {}

    @Test
    @Order(3)
    public void testThird() {}

    @Test
    @Order(2)
    public void testSecond() {}
}
