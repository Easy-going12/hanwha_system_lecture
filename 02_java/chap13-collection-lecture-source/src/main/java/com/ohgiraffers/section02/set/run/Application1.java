package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Set 자료구조의 특성을 이해하고 HashSet을 이용할 수 있다. */
//        HashSet<String> hSet = new HashSet<>();
        Set<String> hSet = new HashSet<>();
        hSet.add(new String("java"));
        hSet.add(new String("mariaDB"));
        hSet.add(new String("servlet"));
        hSet.add(new String("spring"));
        hSet.add(new String("html"));

        /* 설명. 저장한 순서를 유지하지는 않는다. */
        System.out.println("hSet에 저장된 값들: " + hSet);

        /* 설명. 중복 객체는 저장하지 않는다.(객체의 e,h 메소드를 확인하고 중복 체크) */
        hSet.add(new String("mariaDB"));
        System.out.println("hSet에 저장된 값들: " + hSet);

        /* 설명. Set계열 역시 iterable을 상속 받아 iterator()를 호출해 반복자(Iterator)를 활용할 수 있다. */
        Iterator<String> iter = hSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        /* 설명. 굳이 Set을 인덱스 개념을 활용하고 싶으면 toArray()를 쓰되 다운캐스팅에 유의 */
        Object[] objArr = hSet.toArray();
        for (int i = 0; i < objArr.length; i++) {
            System.out.println((String)objArr[i]);
        }

        /* 설명. size() */
        System.out.println("size(): " + hSet.size());
        hSet.clear();
        System.out.println("size(): " + hSet.size());
        System.out.println("isEmpty(): " + hSet.isEmpty());
    }
}