package com.ohgiraffers.userservice.dto;

import lombok.Data;

/* 설명. 회원가입 시 사용자의 입력값을 받아낼 커멘트 축채용 클래스 */@Data
public class RequestRegistUerDTO {
    private String email;
    private String name;
    private String pwd;          // 암호화 되기 전 사용자가 입력한 평문(plan text)
}
