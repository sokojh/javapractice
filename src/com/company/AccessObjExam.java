package com.company;

public class AccessObjExam {
    public static void main(String[] args) {
        AccessObj obj = new AccessObj();
        System.out.println(obj.p);
        System.out.println(obj.p2);
        System.out.println(obj.k);
        //System.out.println(obj.i); Protected라 사용못함
    }
}
