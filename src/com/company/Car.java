package com.company;

public class Car {
    //타입 필드명
    String name;
    int number;
    public Car(String name){
        this.name = name;
    }
    public void run(){
        System.out.println("Car의 run메소드");
    }
    public Car(){
        //this.name = "이름없음";
        //this.number = 0;
        //코드가 반복되는데, this()로 초기화 할수있다. 중복코드 방지!
     this("이름없음",0);

    }
    public Car(String name, int number){
        this.name = name;
        this.number = number;
        System.out.println("Car의 기본생성자입니다.");

    }
}
