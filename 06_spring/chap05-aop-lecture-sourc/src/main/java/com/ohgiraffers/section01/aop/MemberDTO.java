package com.ohgiraffers.section01.aop;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class MemberDTO {
    private Long id;
    // Long null 값이 들어갈 가능성 있으면 래퍼 클래스를 사용한다.
    private String name;
}
