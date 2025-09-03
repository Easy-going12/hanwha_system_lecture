package com.ohgiraffers.filter.section01;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

//@WebFilter(filterName = "secondFilter")
//@WebFilter(filterName="firstFilter", urlPatterns = "/first/*")
@WebFilter("/*")
public class SecondFilter implements Filter {
    public SecondFilter() {
        System.out.println("Second Filter 기본생성자 호출");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("SecondFilter 인스턴스 생성!");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("SecondFilter의 doFilter() 호출 됨... ");

        chain.doFilter(request, response);
        System.out.println("Second: 서블릿 다녀온 이후 client로 응답 전");
    }

    @Override
    public void destroy() {
        System.out.println("SecondFilter 삭제 직전!");
    }
}
