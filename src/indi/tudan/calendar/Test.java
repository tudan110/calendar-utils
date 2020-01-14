package indi.tudan.calendar;

import indi.tudan.calendar.utils.CalendarUtils;

public class Test {

    public static void main(String[] args) throws Exception {

        System.out.println(CalendarUtils.lunarToSolar("20200101", false));
        System.out.println(CalendarUtils.lunarToSolar("20200101", false));
        System.out.println(CalendarUtils.lunarToSolar("20200102", false));
        System.out.println(CalendarUtils.lunarToSolar("20200103", false));
        System.out.println(CalendarUtils.lunarToSolar("20200104", false));
        System.out.println(CalendarUtils.lunarToSolar("20200105", false));
        System.out.println(CalendarUtils.lunarToSolar("20200106", false));

    }
}
