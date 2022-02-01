package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //배열을 for문으로 꺼내는 실습
        int [] iarray = new int[100];
        iarray[0] = 1;
        iarray[1] = 2;
        System.out.println(iarray.length);
        for(int i = 0; i < iarray.length;i++){
            iarray[i] = i + 1;
            System.out.println(iarray[i]);
        }
        //누적해서 더하는 실습
        int sum = 0;
        for(int i =0; i <iarray.length;i++){
            sum = sum+ iarray[i];
            System.out.println(sum);
        }


    }
}




