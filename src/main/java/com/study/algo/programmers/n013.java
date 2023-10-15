package com.study.algo.programmers;

public class n013 {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6){
            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(ch >= '0' && ch <= '9'){ // char는 비교할때 제발 '' 까먹지말기!!!!!!!!!!!
                    answer = true;
                }
                else {
                    answer = false;
                    break;
                }
            }    
        }
        else {
            answer = false;
        }
        
        
        return answer;
    }
}
