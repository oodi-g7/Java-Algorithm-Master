package com.study.algo.programmers;

import java.util.ArrayList;
import java.util.List;

// 중복된 문자 제거

// 문자열 my_string이 매개변수로 주어집니다. 
// my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.

// 1 ≤ my_string ≤ 110
// my_string은 대문자, 소문자, 공백으로 구성되어 있습니다.
// 대문자와 소문자를 구분합니다.
// 공백(" ")도 하나의 문자로 구분합니다.
// 중복된 문자 중 가장 앞에 있는 문자를 남깁니다.
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
