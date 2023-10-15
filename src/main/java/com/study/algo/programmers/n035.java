package com.study.algo.programmers;

import java.util.Arrays;

public class n035 {
    public int solution(String before, String after) {
        int answer = 0;
        
        if(before.length() == after.length()){
            String[] b = before.split("");
            String[] a = after.split("");
            
            Arrays.sort(a);
            Arrays.sort(b);
            
            for(int i=0; i < b.length; i++){
                if(!b[i].equals(a[i])){
                    answer = 0;
                    break;
                }
                else {
                    answer = 1;
                }
            }
        }
        
        return answer;
    }
}
