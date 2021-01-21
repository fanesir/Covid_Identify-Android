package com.example.covid19_project;


import java.text.SimpleDateFormat;
import java.util.Date;


public class ForNew {//大寫類別
    static Double start_time=0.0;
    static Double end_time = 0.0;

    public void runnowtime(String s) {
        Date nowTime = new Date(System.currentTimeMillis());
        SimpleDateFormat sdFormatter = new SimpleDateFormat(s);
        String retStrFormatNowDate = sdFormatter.format(nowTime);


        if (start_time == 0.0) {
            start_time = Double.parseDouble(retStrFormatNowDate);

        }
        if (start_time != 0.0 ) {
            end_time = Double.parseDouble(retStrFormatNowDate);
            start_time = 0.0;
        }
       // start_time = null;

    }
}
