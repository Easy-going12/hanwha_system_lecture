package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Application2 {
    public static void main(String[] args) {
        LocalTime localtime = LocalTime.now();

        System.out.println("localTime = " + localtime);
        System.out.println("시간: " + localtime.getHour());
        System.out.println("분: " + localtime.getMinute());
        System.out.println("초: " + localtime.getSecond());
        System.out.println("나노초: " + localtime.getNano());

        LocalDate localDate = LocalDate.now();
        System.out.println("locatDate = " + localDate);
        System.out.println("년: " + localDate.getYear());
        System.out.println("월: " + localDate.getMonth());
        System.out.println("월(숫자): " + localDate.getMonthValue());
        System.out.println("일(월 중에): " + localDate.getDayOfMonth());
        System.out.println("일(년 중에) = " + localDate.getDayOfYear());
        System.out.println("일(주 중에) = " + localDate.getDayOfWeek());

        ZonedDateTime zoneDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime: " + zoneDateTime);
        System.out.println("zone 정보: " + zoneDateTime.getZone());
        System.out.println("시치: " + zoneDateTime.getOffset());

    }
}
