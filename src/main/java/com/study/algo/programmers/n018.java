package com.study.algo.programmers;

public class n018 {
    public int[] solution(int[] answers) {
        int[] answer1 = {1,2,3,4,5};
        int[] answer2 = {2,1,2,3,2,4,2,5};
        int[] answer3 = {3,3,1,1,2,2,4,4,5,5};
        
        int dingdong1 = 0;
        int dingdong2 = 0;
        int dingdong3 = 0;
        
        int length1 = 0;
        int length2 = 0;
        int length3 = 0;
        for(int i=0; i<answers.length; i++){
            if(length1 > 4){
                length1 = 0;
            }
            if(length2 > 7){
                length2 = 0;
            }
            if(length3 > 9){
                length3 = 0;
            }
            if(answers[i] == answer1[length1]){
                dingdong1++;
            }
            if(answers[i] == answer2[length2]){
                dingdong2++;
            }
            if(answers[i] == answer3[length3]){
                dingdong3++;
            }
            
            length1++;
            length2++;
            length3++;
        }
        
        String max = "";
        if(dingdong1 == dingdong2 && dingdong2 == dingdong3){
            max = "123";
        }
        else if(dingdong1 == dingdong2 && dingdong2 > dingdong3) {
            max = "12";
        }
        else if(dingdong2 == dingdong3 && dingdong3 > dingdong1) {
            max = "23";
        }
        else if(dingdong3 == dingdong1 && dingdong1 > dingdong2) {
            max = "13";
        }
        else {
            int ary[] = {dingdong1, dingdong2, dingdong3};
            int m = dingdong1;
            max = "1";
            for(int i=0; i<ary.length; i++){
                if(m < ary[i]){
                    m = ary[i];
                    max = String.valueOf(i+1);
                }
            }
        }
        
        String[] maxAry = max.split("");
        int[] answer = new int[maxAry.length];
        for(int i=0; i<maxAry.length; i++){
            answer[i] = Integer.parseInt(maxAry[i]);
        }
        
        return answer;
    }
}
