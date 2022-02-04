package com.company;

public class ExceptionExam {
    public static void main(String[] args) {
        //Exception
        int i =10;
        int j = 0;
        try {
            int k = i / j;
            System.out.println(k);
        }
        //catch 구문은 여러개 사용가능하다!
        catch(ArithmeticException e){
            System.out.println("나눌수없습니다."+e.toString());
        }//finally는 실행이 되든 안되든 무조건 실행하는 문이다.
        finally {
            System.out.println("always ex");
        }

        System.out.println("main end!");
    }
}
