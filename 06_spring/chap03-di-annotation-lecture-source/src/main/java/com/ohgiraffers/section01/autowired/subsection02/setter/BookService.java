package com.ohgiraffers.section01.autowired.subsection02.setter;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// field에 있는 BookService와 이름이 겹치기 때문에 따로 이름을 설정해 둔다.
@Service("setterService")
public class BookService {

    private BookDAO bookDAO;

    /* 설명. Setter 추가 */
    /* Application이 만들어 질 때 Setter가 처음부터 주되었다, */
    @Autowired
    public void setBookDAO(BookDAO bookDAO) {
        System.out.println("setter 활용");
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> findAllBook() {
        return bookDAO.findAllBook();
    }

    public BookDTO findBookBySequenceOf(int sequence) {
        return bookDAO.findBookBySequenceOf(sequence);
    }
}