package com.ohgiraffers.section06.singletion;

public class EagerSingletion {

    private static EagerSingletion eager = new EagerSingletion();

    private EagerSingletion() {

    }

    public static EagerSingletion getInstance() {
        return eager;
    }
}
