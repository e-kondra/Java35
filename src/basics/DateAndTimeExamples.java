package basics;

import java.time.*;

public class DateAndTimeExamples {
    public static void main(String[] args) {
        //Local Time
        LocalTime localTime = LocalTime.now().withNano(0).withMinute(12).withSecond(36);
        System.out.println("Now is " + localTime);
        System.out.println(localTime.getHour() + "/" + localTime.getMinute() + "/" + localTime.getSecond());

        LocalTime localTime1 = LocalTime.now().withNano(0);
        localTime1 = localTime1.plusMinutes(12);
        System.out.println("Break until " + localTime1);
        System.out.println("Now is " + localTime.getHour() + " full hours");

        //Local Date
        LocalDate localDate = LocalDate.now();
        System.out.println("Today is " + localDate);
        System.out.println("Year is " + localDate.getYear());
        System.out.println("Day is " + localDate.getDayOfMonth());
        System.out.println("Day of week is " + localDate.getDayOfWeek());
        System.out.println("Day of year is " + localDate.getDayOfYear());

        LocalDate startOfCovid = LocalDate.of(2019, Month.FEBRUARY, 12);
        LocalDate endOfCovid = LocalDate.of(2021, 9, 15);
        System.out.println(endOfCovid);
        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime firstInternationalCatsDay = LocalDateTime.of(2002, 8, 8, 10, 45,0);
        System.out.println("first international cats day was started" + firstInternationalCatsDay);

        //Duration
        System.out.println(Duration.ofHours(10).toMinutes());
        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(2)).toMinutes());

        //period
        System.out.println(Period.between(startOfCovid, LocalDate.now()).toTotalMonths());
    }
}
