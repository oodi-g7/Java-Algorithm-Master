package com.study.algo.programmers;

import java.util.ArrayList;
import java.util.List;

public class n034 {
    public String solution(String my_string) {
        String[] str = my_string.split("");
        
        List<String> list = new ArrayList<>();
        for(int i=0; i<str.length; i++){
            if(!list.contains(str[i])){
                list.add(str[i]);
            }
        }
        
        String answer = "";
        for(String l : list){
            answer += l;
        }
        
        return answer;
    }
}
