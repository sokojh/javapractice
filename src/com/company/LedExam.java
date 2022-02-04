package com.company;

public class LedExam {
    public static void main(String[] args) {
        TV tv = new LedTV();
        tv.changeVolume(3);
        tv.changeVolume(5);
        tv.turnOn();
        tv.turnOff();
    }
}
