package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    // service 계층이라는 것을 표시하는 기능만 한다
public class BookService {

    /* 설명.
     *   필드에 @Autowired를 추가하면 필드를 통한 의존성 객체 주입(bean 주입)으로 필드 주입이라고 한다.
    * */
    @Autowired //  자동으로 BookDAO를 연결한다.
//    private BookDAO bookDAO = new BookDAOImpl();
    private BookDAO bookDAO;
}
