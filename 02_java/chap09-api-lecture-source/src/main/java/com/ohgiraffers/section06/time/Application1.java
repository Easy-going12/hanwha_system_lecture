package com.ohgiraffers.section06.time;

import java.time.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지에서 제공하는 클래스들의 사용 방법을 이해할 수 있다. */
        LocalTime timeNow = LocalTime.now();
        LocalTime timeNow2 = LocalTime.of(14,33,20);
        System.out.println("timeNow = " + timeNow);
        System.out.println("tiemNow2 = " + timeNow2);

        LocalDate dateNow = LocalDate.now();
        LocalDate dateOf= LocalDate.of(2025,8,15);      // month-1을 안해줘도 됨
        System.out.println("dataNow = " + dateNow);
        System.out.println("dateOf = " + dateOf);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime datetimeOf = LocalDateTime.of(2025,8,13,14,33,20);
        System.out.println("dataTimeNow = " + dateTimeNow);
        System.out.println("dataTimeOf = " + datetimeOf);

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf, timeNow2, ZoneId.of("Asisa/Seoul"));
        System.out.println("zonedDateTimeNow = " + zonedDateTimeNow);
        System.out.println("zonedDateTimeOf = " + zonedDateTimeOf);

    }
}
