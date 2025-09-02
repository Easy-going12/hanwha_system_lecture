package com.ohgiraffers.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

@WebServlet("/headers")
public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        long currentTime = System.currentTimeMillis();
        out.print("<h1>" + currentTime + "</h1>");
        out.print("<h2>" + new java.util.Date(currentTime) + "</h1>");
        out.flush();
        out.close();

        // currentTime 값이 들어 왔을 때 입력값을 콘솔에 출력한다.
        Collection<String> responseHeaders = resp.getHeaderNames();
        Iterator<String> iter = responseHeaders.iterator();
        while(iter.hasNext()){
            String headerName = iter.next();
            System.out.println(headerName + ": " + resp.getHeader(headerName));
        }
    }
}
