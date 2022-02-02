package com.company;

public class DuckExam {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.sing();
        duck.fly();
        // Bird b = new Bird(); 오류난다.  추상클래스는 메소드를 이용할수있지만 그자체로 메모리에 못올린다.
    }
}
