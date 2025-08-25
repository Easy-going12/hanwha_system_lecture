package com.ohgiraffers.assertions.section02.assertj;

public class Member {
    private int sequenece;
    private String id;
    private String name;
    private int age;

    public Member() {
    }

    public Member(int sequenece, String id, String name, int age) {
        this.sequenece = sequenece;
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getSequenece() {
        return sequenece;
    }

    public void setSequenece(int sequenece) {
        this.sequenece = sequenece;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
