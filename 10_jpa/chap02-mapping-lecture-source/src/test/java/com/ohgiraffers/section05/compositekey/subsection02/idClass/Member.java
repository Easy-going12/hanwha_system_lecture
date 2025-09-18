package com.ohgiraffers.section05.compositekey.subsection02.idClass;

import jakarta.persistence.*;

@Entity(name="member_section05_subsection02")
@Table(name="tbl_member_section05_subsection02")
@IdClass(MemberPK.class)
public class Member {

    @Id
    @Column(name="member_no")
    private int memberNo;

    @Id
    @Column(name="member_id")
    private String memberId;

    @Column(name="phone")
    private String phone;

    @Column(name="address")
    private String address;

    public Member() {
    }

    public Member(String address, String memberId, int memberNo, String phone) {
        this.address = address;
        this.memberId = memberId;
        this.memberNo = memberNo;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Member{" +
                "address='" + address + '\'' +
                ", memberNo=" + memberNo +
                ", memberId='" + memberId + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
