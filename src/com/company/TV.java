package com.company;

public interface TV {
    //인터페이스 실습
    public int MIN_VOLUME=0;
    public int MAX_VOLUME=100;
    public void turnOn();
    public void turnOff();
    public int changeVolume(int volume);
    public void changeChannel(int channel);
}
