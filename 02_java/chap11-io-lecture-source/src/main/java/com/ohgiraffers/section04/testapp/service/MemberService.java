package com.ohgiraffers.section04.testapp.service;

import com.ohgiraffers.section04.testapp.repository.MemberRepository;

public class MemberService {

//    private final MemberRepository memberRepository = new MemberRepository();
    private final MemberRepository memberRepository;

    public MemberService() {
        memberRepository = new MemberRepository();
    }

    public void findAllMembers() {
        memberRepository.findAllMembers();
    }
}
