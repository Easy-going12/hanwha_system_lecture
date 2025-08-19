package com.ohgiraffers.section04.testapp.repository;

import com.ohgiraffers.section04.testapp.aggregate.AccountStatus;
import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;

import java.io.File;
import java.util.ArrayList;

public class MemberRepository {

    /* 설명. 초기에 Member 파일이 없다면 만들어 더미데이터(dummy data)를 쌓는다. */
    private final ArrayList<Member> memberList = new ArrayList<>();
    private final File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/membeerDB.dat");


    public MemberRepository() {
        if(!file.exists()){
            ArrayList<Member> defaulMemberList = new ArrayList<>();
            defaulMemberList.add(new Member(1,"user01","pass01",20,new String[]{"빨래","수영"}, BloodType.A, AccountStatus.ACTIVE));
            defaulMemberList.add(new Member(2,"user02","pass02",10,new String[]{"게임","영화시청"}, BloodType.B, AccountStatus.ACTIVE));
            defaulMemberList.add(new Member(3,"user03","pass03",30,new String[]{"음악감상","독서","명상"}, BloodType.AB, AccountStatus.ACTIVE));
        }

    }

    public void findAllMembers() {


    }
}
