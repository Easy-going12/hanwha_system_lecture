package com.ohgiraffers.redirect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // OtherServlet에서 넘어온 rep, resp 값이 제대로 넘어오지 않는다 왜? OtherServlet에서 req, resp 값과 다르기 때문이다.
        System.out.println("리다이어렉트 이후 request의 attribute 확인: " + req.getAttribute("test"));
        // resp.sendRedirect("redirect?test=abc"); 으로 값을 저장하여 가져왔다.
        System.out.println("리다이어렉트 이후 request의 parameter 확인: " + req.getParameter("test"));
    }
}
