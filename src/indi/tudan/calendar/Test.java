package indi.tudan.calendar;

import indi.tudan.calendar.utils.CalendarUtils;

public class Test {

    public static void main(String[] args) throws Exception {

        String lastYearStr = CalendarUtils.getSysLastYear();
        System.out.println(lastYearStr);

        String yearStr = CalendarUtils.getSysYear();

        String dayEve = CalendarUtils.getNewYearEve(yearStr);
        String day1st = CalendarUtils.getNewYearDay1st(yearStr);
        String day2nd = CalendarUtils.getNewYearDay2nd(yearStr);
        String day3rd = CalendarUtils.getNewYearDay3rd(yearStr);
        String day4th = CalendarUtils.getNewYearDay4th(yearStr);
        String day5th = CalendarUtils.getNewYearDay5th(yearStr);
        String day6th = CalendarUtils.getNewYearDay6th(yearStr);
        String day7th = CalendarUtils.getNewYearDay7th(yearStr);

        long startTime = Long.parseLong(dayEve + "0000");
        long endTime = Long.parseLong(day7th + "0700");

        System.out.println(startTime);
        System.out.println(endTime);

        System.out.println("\n==============\n");

        System.out.println(dayEve);
        System.out.println(day1st);
        System.out.println(day2nd);
        System.out.println(day3rd);
        System.out.println(day4th);
        System.out.println(day5th);
        System.out.println(day6th);

        System.out.println("\n==============\n");

        System.out.println(CalendarUtils.getSolarNewYearEve());
        System.out.println(CalendarUtils.getSolarNewYear1st());
        System.out.println(CalendarUtils.getSolarNewYear2nd());
        System.out.println(CalendarUtils.getSolarNewYear3rd());
        System.out.println(CalendarUtils.getSolarNewYear4th());
        System.out.println(CalendarUtils.getSolarNewYear5th());
        System.out.println(CalendarUtils.getSolarNewYear6th());

    }
}
