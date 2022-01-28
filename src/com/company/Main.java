package com.company;

public class Main {

    public static void main(String[] args) {
        //switch문 예시
        String str = "A";

        switch(str){
            case "A":
                System.out.println("1");
                break;
            case "B":
                System.out.println("2");
                break;
            case "C" :
                System.out.println("3");
                break;
            default :
                System.out.println("그 외의 숫자");

        }
    }
}
