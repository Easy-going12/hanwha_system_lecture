package com.ohgiraffers.section01.autowired.subsection03.constructor;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("constructorService")
public class BookService {
    // 생성자 주입을 하는 가장 큰 이유가 final를 때문이다. 왜냐 값이 바뀌지 않기 때문이다. 필드 주입 혹은 setter 주입은 에러가 발생한다.
    //  왜 값이 변하지 않으면 좋은데?
    /* 설명.
     *  BookDAO 타입의 빈 객체를 생성자를 통해 주입 받는다.
     *  (기본 생성자 X)
     *
     *  설명.
     *   생성자 주입의 이점
     *    1. 필드에 final 키워드를 사용할 수 있다. (값의 오염 방지)
     *    2. 순환참조를 스프링 시작(컨테이너 생성 시)과 동시에 확인하고 에러를 발생시켜 준다.
     *    3. field 주입 및 setter 주입의 단점을 보완
     *        (필드 주입은 간결하지만 남용할 수 있고 이후에 setter가 없이는 수정이 불가능하다.)
     *        (setter 주입은 불변 객체를 만들고자 함에 있어 문제가 발생할 수 있으면 정말 필요한 객체의 속성
     *         변경을 위해서만 setter를 추가하는 것이 맞다.(feat. 가급적 변경의 여지를 남기지 않아야 한다.)
     *    4. 테스트 코드 작성에 용이하다.(생성자 주입은 @IngectMocks를 사용하지 않고 그 자리에서 객체를 생성해서 쉽게 할 수 있음)
    * */
    private final BookDAO bookDAO;

    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> findAllBook() {
        return bookDAO.findAllBook();
    }

    public BookDTO findBookBySequenceOf(int sequence) {
        return bookDAO.findBookBySequenceOf(sequence);
    }
}
