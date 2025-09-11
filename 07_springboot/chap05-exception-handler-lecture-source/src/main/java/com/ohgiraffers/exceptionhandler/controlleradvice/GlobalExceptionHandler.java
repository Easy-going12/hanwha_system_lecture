package com.ohgiraffers.exceptionhandler.controlleradvice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// 왜 예외를 받는 부분을 controller하고 handler를 나눴는지 의문이다???
// 모든 controller에서 발생하는 오류들을 처리하는 역할
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(GlobalException.class)
    public String handleGlobalException(GlobalException e, Model model){
        model.addAttribute("exceptionMessage","전역에서 처리된 예외: " + e.getMessage());
        return "error/default";
    }

    /* 설명, ArithmeticException은 RuntimeException을 상속받고 있어서 이 ExceptionHandler 처리 가능 */
    @ExceptionHandler(RuntimeException.class)
    public String handleRuntimeException(RuntimeException e, Model model){
        model.addAttribute("exceptionMessage","전역에서 처리된 예외: " + e.getMessage());
        return "error/default";
    }
    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArithmeticException(IllegalArgumentException e, Model model){
        model.addAttribute("exceptionMessage","전역에서 처리된 예외: " + e.getMessage());
        return "error/default";
    }
}
