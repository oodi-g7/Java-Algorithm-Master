package com.study.algo.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 두 개 뽑아서 더하기

// 정수 배열 numbers가 주어집니다.
// numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

// numbers의 길이는 2 이상 100 이하입니다.
// numbers의 모든 수는 0 이상 100 이하입니다.
public class n024 {
    public int[] solution(int[] numbers) {
        List<Integer> array = new ArrayList<>();
        for(int start=0; start<numbers.length; start++){
            for(int end=start+1; end<numbers.length; end++){
                int sum = numbers[start] + numbers[end];
                if(!array.contains(sum)){
                    array.add(sum);
                }
            }
        }
        
        int index = 0;
        int answer[] = new int[array.size()];
        for(Integer ary : array){
            answer[index] = (int)ary;
            index++;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
