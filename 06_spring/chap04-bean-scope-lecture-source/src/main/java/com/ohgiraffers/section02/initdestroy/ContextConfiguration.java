package com.ohgiraffers.section02.initdestroy;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class ContextConfiguration {

    @Bean
    public Product carpBread(){ return new Bread("붕어빵",1000,new java.util.Date()); }

    @Bean
    public Product milk(){ return new Beverage("딸기 우유",1500,500); }

    @Bean
    public Product water(){ return new Beverage("지리산암반수",3000,1500); }

    @Bean
    @Scope("prototype")
    public ShoppingCart shoppingCart(){ return new ShoppingCart();}

    /* 설명. Bean 타입의 클래스에 정의 된 메서드를 활용해서 bean 생성 및 소멸 시점에 호출할 수 있다. */
    @Bean(initMethod = "openShop", destroyMethod = "closeShop")
    public Owner owner(){
        return new Owner();
    }
    // tomcat는 bean을 관리하지 않기 때문에 listener가 통하지 않는다.

}
