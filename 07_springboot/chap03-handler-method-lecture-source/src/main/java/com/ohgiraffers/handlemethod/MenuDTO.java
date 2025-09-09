package com.ohgiraffers.handlemethod;

import lombok.*;

@NoArgsConstructor      // 스프링이 사용 할 생성자
@AllArgsConstructor
@Getter                 // 타임리프에서 값을 꺼낼올 때 사용된다.
@Setter                 // 스프링이 사용 할 setter
@ToString

/* 설명. 사용자의 요청 파라미터를 담기위한 용도의 커맨드 객체용 클래스 */
public class MenuDTO {

    /* 설명. 사용자가 넘기는 parameter의 키 값과 일치하게 필드명 작성 */
    private String name;
    private int price;
    private int categoryCode;
    private String orderableStatus;
}
