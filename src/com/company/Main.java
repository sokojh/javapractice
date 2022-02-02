package com.company;
import java.lang.reflect.Method;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //클래스 메소드 실습 예시
      MyClass cl1 = new MyClass();
        System.out.println(cl1.Mymethod1(3));
        MethodOverloading1 m = new MethodOverloading1();
        System.out.println(m.plus(4,5));
        System.out.println(m.plus(4,5,7));
        System.out.println(m.plus("djdj","djdjd"));




    }
}




