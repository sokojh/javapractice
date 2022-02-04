package com.company;

public class MyCalTest {
    public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.plus(3,4);
        int i = cal.exec(4,5);
        System.out.println(i);
        Calculator.exec2(3,4);
    }
}
