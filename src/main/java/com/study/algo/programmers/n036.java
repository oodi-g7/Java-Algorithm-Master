package com.study.algo.programmers;

import java.util.Arrays;

// 없는 숫자 더하기

// 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
// numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

// 1 ≤ numbers의 길이 ≤ 9
// 0 ≤ numbers의 모든 원소 ≤ 9
// numbers의 모든 원소는 서로 다릅니다.
public class n036 {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        int i = 0;
        for(int j=0; j<numbers.length; j++){
            if(i != numbers[j]){
                answer += i;
                j--;
            }
            i++;
        }
        
        if(i <= 9){
            for(int j=i; j<10; j++){
                answer += j;
            }
        }
        
        return answer;
    }
}
