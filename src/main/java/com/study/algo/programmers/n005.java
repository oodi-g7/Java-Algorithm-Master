package com.study.algo.programmers;

// 자연수 뒤집어 배열로 만들기

// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
// 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

// n은 10,000,000,000이하인 자연수입니다.
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