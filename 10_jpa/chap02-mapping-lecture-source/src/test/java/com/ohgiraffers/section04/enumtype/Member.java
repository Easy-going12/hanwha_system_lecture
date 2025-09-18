package com.ohgiraffers.section04.enumtype;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name="member_section04")
@Table(name="tbl_member_section04")
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

    @Column(name="phone")
    private String phone;

    @Column(name="email")
    private String email;

    @Column(name="address")
    private String address;

    @Column(name="enroll_date")
    private Date enrollDate;

    /* 설명. Enum 타입은 숫자(ORDINAL)/이름(STRING) 두 가지 형태로 설정할 수 있다.(DB에 들어갈 값) */
    @Column(name="member_role")
//    @Enumerated(EnumType.ORDINAL)
    @Enumerated(EnumType.STRING)
    private RoleType memberRole;

    @Column(name="status")
    private String status;

    public Member() {
    }

    public Member(String address, String email, Date enrollDate, String memberId, int memberNo,
                  String memberPwd, RoleType memberRole, String nickname, String phone, String status) {
        this.address = address;
        this.email = email;
        this.enrollDate = enrollDate;
        this.memberId = memberId;
        this.memberNo = memberNo;
        this.memberPwd = memberPwd;
        this.memberRole = memberRole;
        this.nickname = nickname;
        this.phone = phone;
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberPwd() {
        return memberPwd;
    }

    public void setMemberPwd(String memberPwd) {
        this.memberPwd = memberPwd;
    }

    public RoleType getMemberRole() {
        return memberRole;
    }

    public void setMemberRole(RoleType memberRole) {
        this.memberRole = memberRole;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", enrollDate=" + enrollDate +
                ", status='" + status + '\'' +
                ", memberRole=" + memberRole +
                '}';
    }
}