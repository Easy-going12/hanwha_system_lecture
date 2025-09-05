package com.ohgiraffers.section01.autowired.subsection02.setter;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.stereotype.Service;

import java.util.List;

// field에 있는 BookService와 이름이 겹치지기 때문에 이름을 변경해야한다,
@Service("setterService")
public class BookService {
    private BookDAO bookDAO;

    public List<BookDTO> findAllBook() {
        return bookDAO.findAllBook();
    }

    public BookDTO findBookBySequenceOf(int sequence) {
        return bookDAO.findBookBySequenceOf(sequence);
    }

}
