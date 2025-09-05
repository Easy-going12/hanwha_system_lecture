package com.ohgiraffers.common;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/* 설명. add라는 메소드로 집적 상품을 담을 예정(feat. 의존성 주입 X) */
@ToString
public class ShoppingCart {
    // final를 쓴 다는 것이 상품은 변하는데 카드가 그대로 유지한다는 거다.
    private final List<Product> items;

    //NUllPOINTEXCEPTION 방지하기 위해서 final를 사용한다. 그러니까 값이 없으면 오류 걸리도록 한다, 뭐라도 값이 있어야한다.
    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    /* 설명. 카트에 물품을 담는 기능 */
    public void addItem(Product item){
        this.items.add(item);
    }

    /* 설명. 카드에서 물품을 꺼내는 기능 */
    public List<Product> getItems(){
        return items;
    }
}
