package com.ohgiraffers.common;

import lombok.*;

//@NoArgsConstructor      // lombook에서 제공하는 기본생성자
@AllArgsConstructor     // 각 필드에 대한 생성자
//@Setter
//@Getter
//@ToString
@Data
public class MemberDTO {
    private int sequence;
    private String id;
    private String pwd;
    private String name;
}
