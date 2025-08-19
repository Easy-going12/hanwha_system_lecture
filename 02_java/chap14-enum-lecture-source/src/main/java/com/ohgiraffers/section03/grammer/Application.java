package com.ohgiraffers.section03.grammer;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin.name());
        System.out.println(admin.getNameToLowerCaer());

        UserRole2 consuer =  UserRole2.CONSUMER;
        System.out.println(consuer.ordinal() + ", " + consuer.name() + ", " + consuer.getDESCRIPION());

        /* 설명. Set의 개념으로 활용할 수 있다.(feat.Iterator) */
        System.out.println("Set으로 바꿔 활용하게");
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> iter = roles.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().name());
        }
    }
}
