package com.windlike.loquat.util.time;

//import org.thymeleaf.util.DateUtils;
//import org.apache.commons.lang3.time.DateUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class SimpleDateFormatDemo {

    private static final ThreadLocal<DateFormat> df = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

//    private static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>() {
//        @Override
//        protected DateFormat initialValue() {
//            return new SimpleDateFormat("yyyy-MM-dd");
//        }
//    };

    public static void main(String[] args) throws ParseException {

//        DateUtils.addDays(new Date(), 365);
//        test1();
//        test2();
    }

    private static void test2() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println(sdf.format(Calendar.getInstance().getTime()));
    }

    private static void test1() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // Date转String
        String dateStr = sdf.format(date);
        System.out.println(dateStr);
        // String转Date
        date = sdf.parse(dateStr);
        System.out.println(date);
    }
}
