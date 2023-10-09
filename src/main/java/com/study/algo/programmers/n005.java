package com.study.algo.programmers;

public class n005 {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        
        int i = 0;
        while(n > 0){
            answer[i] = (int)(n % 10);
            n /= 10;
            i++;
        }
        
        return answer;
    }
}