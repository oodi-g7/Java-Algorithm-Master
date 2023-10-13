package com.study.algo.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
