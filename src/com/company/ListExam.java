package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("kang");
        list.add("kim");
        System.out.println(list.size());
        for(String str : list){
            System.out.println(str);
        }
    }
}
