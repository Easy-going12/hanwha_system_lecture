package com.ohgiraffers.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Chap05ConfgServerLectureSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap05ConfgServerLectureSourceApplication.class, args);
    }

}
