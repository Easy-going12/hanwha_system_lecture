package com.ohgiraffers.section02.looping;

public class Application {
    public static void main(String[] args) {
        A_for a = new A_for();
//        a.testSimpleForStatement();
//        a.testForExample();
//        a.testForExample2();

        B_nestedfor b = new B_nestedfor();
//        b.printGugudanFromTwoToNine();
//        b.testForExample();

        C_while c = new C_while();
//        c.testSimpleWhileStatement();
//        c.testWhileExample();

        D_doWhile d = new D_doWhile();
//        d.testSimpleDoWhileStatement();
        d.testDoWhileExample();
    }
}