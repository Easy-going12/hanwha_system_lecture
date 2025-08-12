package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {
        A_if a = new A_if();
          a.testSimpleIfStatement();
          a.testNestedIfStatement();

        B_IfElse b = new B_IfElse();
          b.testNestedIfElseStatement();
          b.testSimpleIfElseStatement();

        C_switch c = new C_switch();
          c.testSimpleSwitchStatement();

        D_test d = new D_test();
        d.testNestdeIFElseStatement();
    }
}
