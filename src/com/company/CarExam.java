package com.company;

public class CarExam {
    public static void main(String[] args) {
        //안넣으면 오류가 나게된다.
        Car c1 = new Car("소방차");
        Car c2 = new Car();
        Car c3 = new Car("구급차",1111);
        System.out.println(c2.name+c2.number);

    }
}
