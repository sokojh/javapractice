package com.company;

import java.lang.reflect.Method;

public class MyHelloExam {
    public static void main(String[] args) throws NoSuchMethodException {
        MyHello hello = new MyHello();
        Method method = hello.getClass().getDeclaredMethod("hello");
        if(method.isAnnotationPresent(Count100.class)){
            for(int i=0;i<100;i++){
                hello.hello();
            }
        }else{
            hello.hello();
        }
    }
}
