package com.company;

public class StringBufferExam {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");
        String str = sb.toString();
        System.out.println(str);
        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("hello");
        if(sb2 ==sb3)
            System.out.println("sb2==sb3");
        System.out.println(sb2);
        System.out.println(sb3);
        String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
        //String 버퍼는 이렇게 연결 가능하다.
        System.out.println(str2);
    }
}
