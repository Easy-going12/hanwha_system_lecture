package com.ohgiraffers.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor  // 전체 기본 생성자를 만드는 Annotattion
public class MemberDTO {
    private int sequence;
    private String name;
    private String phone;
    private String email;
    private Account personalAccount;
}
