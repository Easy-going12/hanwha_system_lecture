package com.ohgiraffers.section01.common;

import java.util.List;

public interface BookDAO {

    BookDTO findBookBySequenceOf(int sequence);

    // BookDAO와 BookDTO가 의사소통하도록 하는 채팅방 느낌이다.
    List<BookDTO> findAllBook();
}
