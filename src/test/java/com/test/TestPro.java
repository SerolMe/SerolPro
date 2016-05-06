package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestPro {

    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date(1461897709000L);
//        System.out.println(df.parse("2016/04/30").getTime());
        System.out.println(df.format(date));
    }

}
