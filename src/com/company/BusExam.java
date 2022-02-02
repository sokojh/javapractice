package com.company;

public class BusExam {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.run();
        bus.ppangppang();
        Car car = new Car();
        car.run();
        // car.ppangppang(); 부모는 자식 메소드를 사용할수없다.!
    }
    }

