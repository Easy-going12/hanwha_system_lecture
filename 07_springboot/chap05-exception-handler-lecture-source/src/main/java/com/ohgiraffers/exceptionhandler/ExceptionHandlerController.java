package com.ohgiraffers.exceptionhandler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class ExceptionHandlerController {
    @GetMapping("simple-null")
    public String simpleNullPointerExceptionTest(){
        if(true){   // if를 안 쓸 경우 아래에 return에 값이 닿지 않고 계속해서 반한되기 때문에
                    // 잠시 컴파일러를 속여 unrechable 컴파일 에러를 해소하고 테스트
            throw new NullPointerException();
        }

        return "test";
    }

    @GetMapping("simple-user")
    public String useerExceptionTest() throws MemberRegistException {
        if(true) {
            throw new MemberRegistException("당신은 안되요!");
        }

        return "test";
    }

    @GetMapping("annotation-null")
    public String nullPointerExceptionTest(){
        String str = null;
        str.charAt(0);

        return "test";
    }

    // @GetMapping으로 전역 처리한 예외처리는 해당 주소로 가지만, @ExceptionHandler로 지역 처리로 통해 다음 주소값으로 이동할 수 있다.
    @ExceptionHandler(NullPointerException.class)
    public String nullPointerExceptionHandler(){
        System.out.println("이 Controller에서 NullPointer 예외 발생 시 여기 오는지 확인");

        return "error/default";
    }

    @GetMapping("annotation-user")
    public String userExceptionHandlerTest() throws MemberRegistException{
        if(true){
            throw new MemberRegistException("당신은 안된다니깐!");
        }
        return "test";
    }

    @ExceptionHandler(MemberRegistException.class)
    public String userExceptionHandler(Model model){
        System.out.println("이 Controller에서 MembeerRegist 예외 발생 시 여기 오는지 확인");

        /* 설명. @ExceptionHandler로 해당 컨트롤러별 예외처리를 하면 전역 설정이 사라짐, 필요하면 model에 재료 추가 */
        model.addAttribute("exceptionMessage","당신은 안된다니까?!");

        return "error/default";
    }
}
