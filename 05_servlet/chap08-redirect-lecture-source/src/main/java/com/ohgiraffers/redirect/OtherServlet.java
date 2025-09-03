package com.ohgiraffers.redirect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/otherservlet")
public class OtherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  값을 Attribute에 저장해도 다른 servlet에서 사용 불가
        req.setAttribute("test","abc");

        resp.sendRedirect("redirect?test=abc"); // 보내는 자료가 적고 URL이 더러워진다.
        // 간단한 정보는 이렇게 넘겨도 되지만 많은 주소값 혹은 중요한 데이터의 경우 session 혹은 쿠기에 저장해서 보낸다.
    }
}
