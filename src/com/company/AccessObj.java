package com.company;

public class AccessObj {
    public int p =3;//모두 공개
    protected int p2 = 4; //같은패키지만 접근허용 하지만 상속하면 괜찮음
    int k =2; //default 접근자
    private int i = 1; //
    //public > protected > default > private


}
