package com.company;

public class BoxExam {
    public static void main(String[] args) {
/*
        Box box = new Box();
        box.setObj(new Object());
        Object obj = box.getObj();
        box.setObj("hello");
        String str = (String)box.getObj();
        System.out.println(str);
        box.setObj(1);
        int value = (int)box.getObj();
*/
        Box<Object> box = new Box<>();   //제너릭을 선언하면 형변환을 계속 할 필요없다.
        box.setObj(new Object());
        Object obj = box.getObj();
        Box<String> box2 =new Box<>();
        box2.setObj("hello");
        Box<Integer> box3 = new Box<>();
        box3.setObj(3);



    }
}
