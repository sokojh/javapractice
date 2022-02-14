package com.company;
import java.io.*;
public class ByteExam1 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("src/com/company/ByteExam1.java");
            fos = new FileOutputStream("byte.txt");
            int readCount = -1;
            byte[] buffer = new byte[512];
            while((readCount = fis.read(buffer))!=-1){
                fos.write(buffer,0,readCount);

            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
