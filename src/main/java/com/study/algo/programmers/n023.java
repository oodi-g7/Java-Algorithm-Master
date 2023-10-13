package com.study.algo.programmers;

import java.util.Arrays;

public class n023 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int index = commands[i][2];
            
            int num = 0;
            int repeat = end-start+1;
            int[] sliceAry = new int[repeat];
            while(num < repeat){
                sliceAry[num] = array[start-1];
                start++;
                num++;
            }
            
            Arrays.sort(sliceAry);
            
            answer[i] = sliceAry[index-1];
        }
        return answer;
    }
}
