package com.company;

public class Main {

    public static void main(String[] args) {
        //while문 예시
        int i = 1;
        int a = 1;
        int atotal = 0;
        int total = 0; // i의 값을 누적할 변수를 선언합니다.int i = 1;
        while(i <= 100){
            total = total + i;
            i++;
        }
        while(a<=100){
            atotal = atotal + a;
            i++;
            System.out.println(atotal);
        }


    }
}
