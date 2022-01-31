package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //1차원 배열 실습 예제
        //int[] array1 = new int[] {1,2,3,4,5};//선언과 초기화,할당을 동시에하는 경우
       int[] array1 = new  int[4]; //선언 따로 할당따로
       array1[0] = 1;
       array1[1] = 2;
       array1[2] = 3;
       array1[3] = 4;
       //array1[4] = 5; 이렇게하면 오류 난다 왜? 우리가 위에서 만든 4라는 숫자는 '크기' 4라는 뜻이다. 배열 4까지가 아니라!
        System.out.println(array1[1]);



    }
}




