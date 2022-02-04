package com.company;

public class LedTV implements TV{

    @Override
    public void turnOn() {
        System.out.println("켜다");
    }

    @Override
    public void turnOff() {
        System.out.println("끄다");
    }

    @Override
    public int changeVolume(int volume) {
        System.out.println("볼륨변경");
        return volume * 2 ;
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("채널변경");
    }
}
