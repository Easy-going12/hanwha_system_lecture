package com.ohgiraffers.section04.interfacesegregation.resolved;

public class BasicPrinter implements PrintOnly {
    @Override
    public void print() {
        System.out.println("깔믂하게 문서를 출력합니다.");
    }
}
