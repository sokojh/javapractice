package com.company;

public class BusExam {
    public static void main(String[] args) {
        Car c = new Bus();
        c.run();
        //부모타입으로 가르킬순있지만 자식메소드를 사용할순없다.

        Bus bus = (Bus)c;
        bus.run();
        bus.ppangppang();

        // car.ppangppang(); 부모는 자식 메소드를 사용할수없다.!
    }
    }

