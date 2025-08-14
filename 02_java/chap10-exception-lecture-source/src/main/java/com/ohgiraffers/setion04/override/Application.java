package com.ohgiraffers.setion04.override;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {

        SuperClass superclass = new SubClass();
        try {
            superclass.method();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
