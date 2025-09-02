package com.ohgiraffers.servicemethod;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/request-service")
public class ServiceMethodTestServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("req = " + req);
        System.out.println("res = " + res);

        /* 설명. Http Method를 확인하기 위해 실제 객체 타입인 HttpServletXXX 계열로 다운 캐스팅 후 확인 */
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpServletResponse httpResponse = (HttpServletResponse) res;

        String httpMethod = httpRequest.getMethod();
        System.out.println("httpMethod = " + httpMethod);

        /* 설명.
         *   기본적으로 쓰는 Http Method 방식
         *   1. GET - 조회
         *   2. Post - 추가
         *   3. PUT/PATCH - 수정
         *   4. DELETE  - 삭제
        * */
        // REST API이란 주소창에 URL 주소 값 온 후에 위에 방식에 따라 운영되어진다.

        //httpMethod.equals("GET")으로 NULL POINT 에러가 발생할 수도 있다.
        if("GET".equals(httpMethod)){
            doGet(httpRequest, httpResponse);
        } else if("POST".equals(httpMethod)){
            doPost(httpRequest, httpResponse);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET 요청을 처리할 메소드 호출됨...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST 요청을 처리할 메소드 호출됨...");
    }
}
