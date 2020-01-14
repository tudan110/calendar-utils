package indi.tudan.calendar;

import indi.tudan.calendar.utils.CalendarUtils;

public class Test {

    public static void main(String[] args) throws Exception {

        String yearStr = CalendarUtils.getSysYear();

        String eve = Integer.parseInt(CalendarUtils.lunarToSolar(yearStr + "0101", false)) - 1 + "";
        String day1st = CalendarUtils.lunarToSolar(yearStr + "0101", false);
        String day2nd = CalendarUtils.lunarToSolar(yearStr + "0102", false);
        String day3rd = CalendarUtils.lunarToSolar(yearStr + "0103", false);
        String day4th = CalendarUtils.lunarToSolar(yearStr + "0104", false);
        String day5th = CalendarUtils.lunarToSolar(yearStr + "0105", false);
        String day6th = CalendarUtils.lunarToSolar(yearStr + "0106", false);

        System.out.println(eve);
        System.out.println(day1st);
        System.out.println(day2nd);
        System.out.println(day3rd);
        System.out.println(day4th);
        System.out.println(day5th);
        System.out.println(day6th);

    }
}
