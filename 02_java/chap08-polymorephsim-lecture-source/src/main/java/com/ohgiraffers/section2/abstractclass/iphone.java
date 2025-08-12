package com.ohgiraffers.section2.abstractclass;

public class iphone extends Product {

    public iphone() {
        super();
    }

    @Override
    public void abstractMethod() {
        System.out.println("안 빼먹고 오버라이딩 잘 했다잉!~~");
    }
}
