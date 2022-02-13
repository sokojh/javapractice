package com.company;

public class WrapperExam {
    public static void main(String[] args) {
        int i = 5;
        Integer i2 = new Integer(5);//예전 작성
        Integer i3 = 5;//자동으로 형변환 시켜줌 - 오토박싱이라고 함.
        int i4 = i3.intValue(); //원래 이렇게 형변환 해줘야함.

        int i5 =i3;//오토 언박싱 해줌
    }
}
