package com.study.algo.programmers;

// 정답아님...
// 추후에 코드 보완하기

public class n063 {
    public String solution(String number, int k) {
        // 뒤에서 k개 숫자를 지운 후, 남아있는 숫자 중 가장 큰 수 찾기
        String cut = number.substring(0, number.length()-k);
        String[] numAry = cut.split("");
        
        int max = 0;
        int max_index = 0;
        for(int i=0; i<numAry.length; i++){
            int n = Integer.parseInt(numAry[i]);
            if(max < n){
                max = n;
                max_index = i;
            } 
        }
        
        // max_index를 기준으로 자르고 앞에 잘린 수의 개수는 k에서 지우기
        String answer = number.substring(max_index, max_index+1);
        number = number.substring(max_index+1);
        k -= max_index;
        
        // 뒤에서 k개 숫자를 지운 후, 남아있는 숫자 중 가장 작은 수 찾아서 지우기
        while(k>0){
            int min = 10;
            int min_index = 0;
            for(int i=0; i<number.length()-k; i++){
                int n = Integer.parseInt(number.substring(i, i+1));
                if(n < min){
                    min = n;
                    min_index = i;
                }
            }
            
            number = number.substring(0, min_index) + number.substring(min_index+1);
            k -= 1;
        }
        
        answer += number;
        
        return answer;
    }
}
