package com.company;

import java.util.Calendar;

public class CalendarExam {
    public static String hundredDaysAfter(){
        //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
        Calendar cal = Calendar.getInstance();
        int yyyy = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int date = cal.get(Calendar.DATE);

        return yyyy+"년"+(month+3)+"월"+(date+10)+"일";
    }
    public static void main(String[] args) {
        System.out.println(hundredDaysAfter());
    }
}
