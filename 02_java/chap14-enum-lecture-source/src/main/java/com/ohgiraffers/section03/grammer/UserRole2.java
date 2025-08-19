package com.ohgiraffers.section03.grammer;

public enum UserRole2 {
    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");

    private final String DESCRIPION;

    UserRole2(String DESCRIPION) {
        this.DESCRIPION = DESCRIPION;
    }

    public String getDESCRIPION() {
        return DESCRIPION;
    }
}
