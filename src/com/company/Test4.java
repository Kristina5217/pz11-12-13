package com.company;

import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class Test4 {
    public Test4() {
    }
    public static void main(String[] args) {
        Test4 test = new Test4();
        SimpleTimeZone stz = new SimpleTimeZone(
                TimeZone.getDefault().getRawOffset()
                ,TimeZone.getDefault().getID()
                ,Calendar.MARCH
                ,-1
                ,Calendar.SUNDAY
                ,test.getTime(2,0,0,0)
                ,Calendar.OCTOBER
                ,-1
                ,Calendar.SUNDAY
                ,test.getTime(3,0,0,0)
        );
        System.out.println(stz.toString());
    }
    int getTime(int hour,int min,int sec,int ms){
        return hour * 3600000 + min * 60000 + sec * 1000 + ms;
    }
}
