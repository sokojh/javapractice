package com.company;

public class Main {

    public static void main(String[] args) {
        //while문 예시
        int i = 1;
        int total = 0; // i의 값을 누적할 변수를 선언합니다.int i = 1;
        while(i <= 100){
            total = total + i;
            i++;
        }
        System.out.println(i);

    }
}
