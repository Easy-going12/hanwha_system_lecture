package com.ohgiraffers.common;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/* 설명. @Repository도 @Component 계열이란 bean이 된다. */
@Repository     // @Repository 안에 Component가 포함되어 있다. DB에서 에러가 나면 java의 injection으로 바꿔주는 역할을 한다.
//@Component
public class MemberDAO {
    public MemberDAO() {
        System.out.println("콩 될 때 이거 쓰나?");
    }
}
