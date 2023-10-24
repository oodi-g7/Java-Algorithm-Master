package com.study.algo.programmers;

// 외톨이 알파벳

// 문자열 input_string이 주어졌을 때, 
// 외톨이 알파벳들을 알파벳순으로 이어 붙인 문자열을 return 하도록 solution 함수를 완성해주세요. 
// 만약, 외톨이 알파벳이 없다면 문자열 "N"을 return 합니다.
import java.util.HashMap;

public class n076 {
        public String solution(String input_string) {
        String answer = "";
        // 출현
        HashMap<Character, Integer> exposeCnt = new HashMap<>();
        // 분리
        HashMap<Character, Integer> divideCnt = new HashMap<>();
        
        char prevChar = '-';
        for(int i=0; i<input_string.length(); i++){
            char ch = input_string.charAt(i);
            // 출연횟수 +1
            exposeCnt.put(ch, exposeCnt.getOrDefault(ch, 0) + 1); 
            
            if(ch != prevChar){
                // 분리된거면 분리횟수 +1
                divideCnt.put(ch, divideCnt.getOrDefault(ch, 0) + 1); 
            }
            prevChar = ch;
        }
        
        // 2회이상 출연, 2회이상 분리됐으면 answer에 붙이기
        for(char key : exposeCnt.keySet()){
            if(exposeCnt.get(key) >= 2 && divideCnt.get(key) >= 2){
                answer += key;
            }
        }
        
        if(answer == ""){
            answer = "N";
        }
        
        return answer;
    }
}
