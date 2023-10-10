package com.study.algo.programmers;

public class n007 {
    // 각 단어는 *하나 이상의* 공백문자로 구분
    public String solution(String s) {
        String answer = "";
        String str[] = s.split("");
        
        int index = 0;
        for(int i=0; i<str.length; i++){
            if(str[i].equals(" ")){
                answer += " ";
                index = 0;
            }
            else {
                if(index == 0 || index % 2 == 0){
                    answer += str[i].toUpperCase();
                    index++;
                }
                else{
                    answer += str[i].toLowerCase();
                    index++;
                }
            }
        }
        
        return answer;
    }
}
