package com.ohgiraffers.section07.initblock;

public class Product {
    private String name = "아이폰";        // 인스턴스 변수1
    private int price;                    // 인스턴스 변수2
    private static String brand;          // 클래스 변수

    /* 설명. 초기화 블럭은 생성자 이전에 실행되며 어떤 생성자로 생성하든
     *      공통적인 로직이 있다면 작성
    * */

    {
        System.out.println("초기화 블록 실행... ");
        name = "폴드";
        price = 100;
        brand = "삼성";
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    static {
//         price = 200;            // static 초기화 블럭에서 인스턴스 변수(non-static)에 접근이 불가능하다.
        brand = "현대";
    }

    public Product() {
        System.out.println("Product 기본 생성자 호출됨... ");
        brand = "퓨리오사AI";
    }
}
