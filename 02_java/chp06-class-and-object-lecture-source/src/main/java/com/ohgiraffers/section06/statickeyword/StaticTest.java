package com.ohgiraffers.section06.statickeyword;

public class StaticTest {
    private int nonStaticCount;
    private static int staticCount;

    public StaticTest() {
    }


    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {
        return staticCount;
    }

    public int increaseNonStaticCount() {
        return this.nonStaticCount++;
    }

    public static int increaseStaticCount() {
        return StaticTest.staticCount++;
    }
}
