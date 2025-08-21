package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. filter() 중계 연산자를 활용할 수 있다. */
        IntStream.range(0, 10)
                .filter(num -> num > 5)
                .forEach(System.out::println);

        /* 설명.
         *  Arrays.stream()은 배열(int[])만 인자로 받으며, 배열의 각 요소로 스트림을 만듦
         *  반면. IntStream.of()는 IntStream.of(1,2,3)처럼 숫자를 직접 나열 할 수도 있다.
        * */
        int[] scores = {45, 78, 92, 67, 88, 59, 95, 73, 84, 52};
        IntStream sStream = Arrays.stream(scores);              // 배열일 경우는 이걸 더 선호
        sStream.filter(score -> score > 70)
                .forEach(score -> System.out.println(score + "점"));
        System.out.println();

        IntStream.of(scores)
//        IntStream.of(45, 78, 92, 67, 88, 59, 95, 73, 84, 52)  // 배열이 아닐 경우는 이걸 더 선호
                .filter(score -> score > 70)
                .forEach(score -> System.out.println(score + "점"));
    }
}
