package com.ohgiraffers.section01.intro;

/* 설명.
 *  Stream이란?
 *   - 컬렉션이나 배열을 함수형 프로그래밍으로 처리할 수 잇게 해주는 API
 *   - 데이터를 필터링, 변화느 통계/집계 등의 작업을 간결하고 효율적으로 처리 가능
 *   - 원본 데이터를 변경하지 않고 새로운 결과를 생성(불변성)
* */

public class Application {
    public static void main(String[] args) {

        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("CPU 코어 수: " + coreCount + "개");
    }
}
