package com.ohgiraffers.section01.scope.singleton;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carpBread(){
        return new Bread("붕어빵",1000,new java.util.Date());
    }

    @Bean
    public Product milk(){
        return new Beverage("딸기 우유",1500,500);
    }

    @Bean
    public Product water(){
        return new Beverage("지리산암반수",3000,1500);
    }

    /* 설명.
     *  bean 스코프를 수정하게 되면 bean의 life cycle을 다른 추지로 가져갈 수 있다.
     *
    * */

    @Bean
//    @Scope("singleton") // 표시하지 않더라도 기본으로 달려있다. 따라서 싱글톤 구조 이기 때문에 클래스 호출할 때마다 같은 메서드가 호출된다.
    @Scope("prototype")
    public ShoppingCart shoppingCart(){
        return new ShoppingCart();
    }
    // 지금까지는 singleton 구조 이기 때문에 쇼핑카드를 하나만 사용한다.
    // 각 물건을 담는 객체가 새로 생길때마다 쇼핑카트를 각각 생성하는 것도 가능하다.
}

