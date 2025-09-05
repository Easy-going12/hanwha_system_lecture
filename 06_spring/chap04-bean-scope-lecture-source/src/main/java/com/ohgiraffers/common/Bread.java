package com.ohgiraffers.common;

import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
// 이 방식으로 기본 생성자는 쉽게 만들지만 자세한 값을 넣을 대는 java나 xml 방식으로 값을 직접 입력하는 것이 좋다
public class Bread extends Product {
    private java.util.Date bakeDate;    // 생성 시간

    public Bread(String name, int price, Date bakeDate) {
        super(name, price);
        this.bakeDate = bakeDate;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "bakeDate=" + bakeDate +
                "} " + super.toString();
    }
}
