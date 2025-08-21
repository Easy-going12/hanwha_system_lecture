package com.ohgiraffers.section03.reference;

import java.util.function.Function;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 기존에 존재하는 생성자를 참조한 람다식을 작성할 수 있다. */
        Function<String, Member> member =
//                (x) -> {return new Member(x);};
        x -> new Member(x);
        System.out.println(member.apply("m01"));

        // Member 클래스에서 생성자가 두개인데 어떤 생성자를 사용하는 구분하는 방법은 Function<String .. 부분에서
        // String 타입으로 값을 하나 받아온다는 의미이기 때문에 Member에서 생성자가 하나인 메서드를 가져온다.
        Function<String, Member> member2 = Member::new;
        System.out.println(member2.apply("m02"));
    }
}
