package com.ohgiraffers.section01.common;

import java.util.List;

/* 인터페이스를 쓰는 이유
 *  1. 실무에서 연결된 DB가 종류에 상관없이 인터페이스만 가져다 쓰면 DB 연결이 이루어짐
 *  2. 실제 구현 클래스에 기능이 문제가 생기더라도 다른 클래스에 영향을 끼치지 않게 하기 위해서
 *  3. 개방 폐쇄 원칙 처럼 다른 클래스이 기능을 추가가능하다.
* */
public interface BookDAO {
    BookDTO findBookBySequenceOf(int sequence);

    List<BookDTO> findAllBook();
}
