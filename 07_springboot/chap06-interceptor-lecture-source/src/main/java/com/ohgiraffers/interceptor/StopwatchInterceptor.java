package com.ohgiraffers.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;

@Component
public class StopwatchInterceptor implements HandlerInterceptor {

    private final SpringResourceTemplateResolver springResourceTemplateResolver;

    public StopwatchInterceptor(SpringResourceTemplateResolver springResourceTemplateResolver) {
        this.springResourceTemplateResolver = springResourceTemplateResolver;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("preHandler 호출함 ....(핸들러 메소드 이전)");

        long startTime = System.currentTimeMillis();    // 시스템의 현재 시간을 밀리초 단위 long형으로 반환
        request.setAttribute("startTime", startTime);

        /* 설명. 핸들러 인터셉터의 preHandler이 반환하는 boolean형에 따라 Controller의 핸들러 메소드 동작여부 조절 가능 */
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandler 호출함 ... (핸들러 메소드 이후)");
        long startTime = (long)request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();

        /* 설명. postHandle의 ModelAndView는 Controller의 핸들러메소드가 반환한 내용(재료) + 뷰가 담겨있다. */
        modelAndView.addObject("interval", endTime -startTime);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
