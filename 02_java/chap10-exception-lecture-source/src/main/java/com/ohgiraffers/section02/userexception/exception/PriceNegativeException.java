package com.ohgiraffers.section02.userexception.exception;

public class PriceNegativeException extends Throwable {
    public PriceNegativeException(String message) {
        super(message);
    }
}
