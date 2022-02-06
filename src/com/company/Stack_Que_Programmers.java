package com.company;

import java.util.ArrayList;

class Solution {
    int[] progresses = {93, 30, 55};
    int[] speeds = 	{1, 30, 5};
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> b = new ArrayList<Integer>();
        for(int i = 0;i < progresses.length; i++){
                int a= (progresses[i]-100)/speeds[i];

                b.add(a);
            System.out.println(a);



        }
        for(int index=0; index <b.size();index++){
            System.out.println(b.get(index));
        }

        int[] answer = {};
        return answer;
    }
}

public class Stack_Que_Programmers {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.solution(s1.progresses,s1.speeds);
    }
}
