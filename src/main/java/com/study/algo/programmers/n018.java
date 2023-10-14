package com.study.algo.programmers;

// 모의고사

// 수포자는 수학을 포기한 사람의 준말입니다. 
// 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
// 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
// 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
// 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
// 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
// 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

// 시험은 최대 10,000 문제로 구성되어있습니다.
// 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
// 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
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
