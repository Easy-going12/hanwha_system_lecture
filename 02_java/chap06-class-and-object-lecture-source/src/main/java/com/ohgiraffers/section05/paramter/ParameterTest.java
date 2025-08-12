package com.ohgiraffers.section05.paramter;

import java.util.Arrays;

public class ParameterTest {
    public void testPrimitiveTypeParameter(int num) {
        num += 1;
        System.out.println("메소드 안 num = " + num);
    }

    public void testprimitiveArrayTypeParameter(int[] iArr) {
        iArr[0] = 10;
        System.out.println("메소드 안 iArr = " + Arrays.toString(iArr));
    }

    public void testClassTypeParameter(Rectangle r) {
        r.callArea();
        r.calRound();
    }

    public void testVariabeLengthArrayParmeter(String... str) {
        System.out.println("넘어온 인자 출력: " + Arrays.toString(str));
    }
}
