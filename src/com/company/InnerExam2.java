package com.company;

public class InnerExam2 {
    static class Cal{
        int value =0;
        public void plus(){
            value++;

        }
    }
    public static void main(String[] args) {
        InnerExam2.Cal cal = new InnerExam2.Cal(); //아까는 먼저 InnerExam2  객체를 만들고 다시 내부클래스를 선언했는데
        cal.plus(); //static내부클래스는 바로 객체로 만들어 사용할수 있다는 특징이 있네.
        System.out.println(cal.value);
    }
}
