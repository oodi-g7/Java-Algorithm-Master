package com.study.algo.programmers;

import java.util.Arrays;

// 문자열 내림차순으로 배치하기

// 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
// s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

// str은 길이 1 이상인 문자열입니다.
public class n026 {
    public String solution(String s) {
        String answer = "";
        
        String upper = "";
        String lower = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                upper += String.valueOf(s.charAt(i));
            }
            else if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                lower += String.valueOf(s.charAt(i));
            }
        }
        
        String up[] = upper.split("");
        String lw[] = lower.split("");
        
        Arrays.sort(up);
        Arrays.sort(lw);
        
        for(int i=lw.length-1; i>=0; i--){
            answer += lw[i];
        }
        for(int i=up.length-1; i>=0; i--){
            answer += up[i];
        }
        
        return answer;
    }
}
