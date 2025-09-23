package com.ohgiraffers.firstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
public class Chap0201FirstServiceLectureSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap0201FirstServiceLectureSourceApplication.class, args);
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String header){
        log.info("first-request header: {}", header);
        return "First Service Message";
    }
}
