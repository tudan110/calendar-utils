package indi.tudan.calendar;

import indi.tudan.calendar.utils.CalendarUtils;

public class Test {

    public static void main(String[] args) throws Exception {

        String dayEve = CalendarUtils.getNewYearEve();
        String day1st = CalendarUtils.getNewYearDay1st();
        String day2nd = CalendarUtils.getNewYearDay2nd();
        String day3rd = CalendarUtils.getNewYearDay3rd();
        String day4th = CalendarUtils.getNewYearDay4th();
        String day5th = CalendarUtils.getNewYearDay5th();
        String day6th = CalendarUtils.getNewYearDay6th();
        String day7th = CalendarUtils.getNewYearDay7th();

        /*String yearStr = CalendarUtils.getSysYear();

        String dayEve = CalendarUtils.getNewYearEve(yearStr);
        String day1st = CalendarUtils.getNewYearDay1st(yearStr);
        String day2nd = CalendarUtils.getNewYearDay2nd(yearStr);
        String day3rd = CalendarUtils.getNewYearDay3rd(yearStr);
        String day4th = CalendarUtils.getNewYearDay4th(yearStr);
        String day5th = CalendarUtils.getNewYearDay5th(yearStr);
        String day6th = CalendarUtils.getNewYearDay6th(yearStr);
        String day7th = CalendarUtils.getNewYearDay7th(yearStr);*/

        /*long startTime = Long.parseLong(dayEve + "0000");
        long endTime = Long.parseLong(day7th + "0700");

        System.out.println(startTime);
        System.out.println(endTime);*/

        System.out.println("\n============================\n");

        System.out.println("除夕：" + dayEve);
        System.out.println("初一：" + day1st);
        System.out.println("初二：" + day2nd);
        System.out.println("初三：" + day3rd);
        System.out.println("初四：" + day4th);
        System.out.println("初五：" + day5th);
        System.out.println("初六：" + day6th);
        System.out.println("初七：" + day7th);

        System.out.println("\n============================\n");

        System.out.println("" + CalendarUtils.getSolarNewYearEve());
        System.out.println("" + CalendarUtils.getSolarNewYear1st());
        System.out.println("" + CalendarUtils.getSolarNewYear2nd());
        System.out.println("" + CalendarUtils.getSolarNewYear3rd());
        System.out.println("" + CalendarUtils.getSolarNewYear4th());
        System.out.println("" + CalendarUtils.getSolarNewYear5th());
        System.out.println("" + CalendarUtils.getSolarNewYear6th());

    }
}
