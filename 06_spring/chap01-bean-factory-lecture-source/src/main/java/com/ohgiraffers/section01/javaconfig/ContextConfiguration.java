package com.ohgiraffers.section01.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    /* 설명. 메소드명이 기본 bean의 이름이 되고, 다른 이름을 하고 싶으면 어노테이션에 이름을 작성할 수 있다. */
    @Bean(name = "member")  // Configuration - Bean은 우리가 호출하는 것이 아닌 Spring이 보내준다. 메소드 이름이 콩의 이름이고
          // @는 Spring이 알아 볼 수 있게 하는 주소라고 생각하면 될거 같다.
    public MemberDTO getMember(){
        return new MemberDTO(1, "user01","pass01","홍길동");
    }
}
