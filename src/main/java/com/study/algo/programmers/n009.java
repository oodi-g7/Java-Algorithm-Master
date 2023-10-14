package com.study.algo.programmers;

// 3진법 뒤집기

// 자연수 n이 매개변수로 주어집니다. 
// n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

// n은 1 이상 100,000,000 이하인 자연수입니다.
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
