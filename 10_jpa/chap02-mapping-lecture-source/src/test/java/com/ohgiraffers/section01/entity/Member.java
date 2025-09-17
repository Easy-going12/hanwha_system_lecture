package com.ohgiraffers.section01.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity(name="member_section01")
@Table(name="tbl_member_section01")
public class Member {
    @Id
    @Column(name="member_no")
    private int memberNo;
    @Column(name="member_id")
    private String memberId;
    @Column(name="member_pwd")
    private String memberPwd;
    @Column(name="nickname")
    private String nickname;
    @Column(name="phont")
    private String phont;
    @Column(name="email")
    private String email;
    @Column(name="address")
    private String address;
    @Column(name="enrollDate")
    private java.util.Date enrollDate;
    @Column(name="memberRole")
    private String memberRole;
    @Column(name="status")
    private String status;

    public Member() {
    }

    public Member(String address, String email, Date enrollDate, String memberId, int memberNo,
                  String memberPwd, String memberRole, String nickname, String phont, String status) {
        this.address = address;
        this.email = email;
        this.enrollDate = enrollDate;
        this.memberId = memberId;
        this.memberNo = memberNo;
        this.memberPwd = memberPwd;
        this.memberRole = memberRole;
        this.nickname = nickname;
        this.phont = phont;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Member{" +
                "address='" + address + '\'' +
                ", memberNo=" + memberNo +
                ", memberId='" + memberId + '\'' +
                ", memberPwd='" + memberPwd + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phont='" + phont + '\'' +
                ", email='" + email + '\'' +
                ", enrollDate=" + enrollDate +
                ", memberRole='" + memberRole + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
