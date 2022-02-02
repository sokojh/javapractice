package com.company;

public class MethodOverloading1 {
    public int plus (int x, int y){
        return x+y;
    }
    public int plus(int x,int y,int z){
        return x+y+z;
    }
    public String plus(String x, String y){
        return x+y;
    }
    // 매개변수의 이름이 다르면 되는것이 아니고 타입과 매개변수 숫자에 따라 정해진다!
 //   public int plus(int i,int j){
  //      return i+j;
  //  }
}
