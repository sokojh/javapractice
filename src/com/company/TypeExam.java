package com.company;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
public class TypeExam {
    public static void main(String[] args) {

        try(
                //try의 뒤에나오는 괄호()사이에서 만든 stream은 별도로 close하지 않아도 됩니다.
                DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
                DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
        ){
            //이 아래에 out을 이용해서 data.txt에 int값 100, double값 3.14를 저장하세요.
            out.write(100);
            out.writeDouble(3.14);

        }
        catch(Exception e){
        }
    }
}


