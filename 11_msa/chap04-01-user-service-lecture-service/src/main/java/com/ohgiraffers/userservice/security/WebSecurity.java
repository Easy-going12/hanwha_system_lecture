package com.ohgiraffers.userservice.security;

import jakarta.servlet.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import java.util.Collections;

/* 설명. Spring Security 모듈 추가 후 default 로그인 페이지 제거 및 인가 설정 */
@Configuration
public class WebSecurity {

    private JwtAuthenticationProvider jwtAuthenticationProvider;
    private Environment env;    // JWT Token의 payload에 만료시간 만들다가 추가함

    @Autowired
    public WebSecurity(JwtAuthenticationProvider jwtAuthenticationProvider,  Environment env) {
        this.jwtAuthenticationProvider = jwtAuthenticationProvider;
        this.env = env;
    }

    /* 설명. 우리가 만든 프로바이더 bean으로 등록 */
    @Bean
    public AuthenticationManager authenticationManager(){
        return new ProviderManager(Collections.singletonList(jwtAuthenticationProvider));
    }

    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {

        // csrf 토큰을 쓰지 않게 않는다는 선언. 지금 쓰이는 구조에서 게이트웨이에서 막힌다.
        http.csrf(csrf -> csrf.disable());

        http.authorizeHttpRequests(authz->
                authz.requestMatchers("/**").permitAll()      // 인가(Authorization) 부분
                        .anyRequest().authenticated()
        );

        /* 설명. 매니저를 지닌 필터 등록 */
        http.addFilter(getAuthenticationFilter(authenticationManager()));

        /* 설명. Session 방식이 아닌 JWT Token 방식을 사용하겠다. */

        return http.build();
    }

    private Filter getAuthenticationFilter(AuthenticationManager authenticationManager) {
        return new AuthenticationFilter(authenticationManager, env);
    }
}
