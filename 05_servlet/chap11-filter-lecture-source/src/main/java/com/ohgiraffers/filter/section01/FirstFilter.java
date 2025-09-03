package com.ohgiraffers.filter.section01;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

/* 설명.
 *  @WebFilter라는 어노테이션을 통해 필터 설정을 할 수 있지만 요청 시 필터의 동작 순서를
 *  정하기 위해서는 Servlet에서는 web.xml을 통한 설정 시 작성된 순서로만 바꿔줄 수 있다.
 *  (즉, web.xml에 작성한 filter mapping의 순서에 따라 작성한다)
* */
//@WebFilter(filterName = "firstFilter")
//@WebFilter(filterName = "secondFilter", urlPatterns = "/*")
@WebFilter("/first/*")
public class FirstFilter implements Filter {

    public FirstFilter() {
        System.out.println("Filter 기본생성자 호출");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FirstFilter 인스턴스 생성!");
    }

    // filter 기능을 정할 때 반드시 필요한 메서드이다.
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("FirstFilter의 doFilter() 호출 됨... ");

        /* 설명. FilterChain에서 제공하는 doFilter를 통해 다음 필터 또는 서블릿으로 진행하라는 의미이다. */
        chain.doFilter(request, response);      // 이 부분을 적지 않으면 다음 서블릿으로 넘어가지 못함
        System.out.println("First: 서블릿 다녀온 이후 client로 응답 전");
    }

    @Override
    public void destroy() {
        System.out.println("FirstFilter 삭제 직전!");
    }
}
