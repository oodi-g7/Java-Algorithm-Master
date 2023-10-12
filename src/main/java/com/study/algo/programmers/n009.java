package com.study.algo.programmers;

public class n009 {
    public int solution(int n) {
        int answer = 0;
        
        String str = "";
        while(n > 0){
            str = (n % 3) == 0 ? "0" + str : (n % 3) + str;
            n = n / 3;
        }
        
        String num[] = str.split("");
        for(int i=0; i<str.length(); i++){
            answer += Integer.parseInt(num[i]) * Math.pow(3,i);
        }
        
        return answer;
    }
}
