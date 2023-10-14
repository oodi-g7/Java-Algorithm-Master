package com.study.algo.programmers;

import java.util.Arrays;

// 완주하지 못한 선수

// 수많은 마라톤 선수들이 마라톤에 참여하였습니다.
// 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
// 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
// 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

// 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
// completion의 길이는 participant의 길이보다 1 작습니다.
// 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
// 참가자 중에는 동명이인이 있을 수 있습니다.
public class n037 {
    public String solution(String[] participant, String[] completion) {
        // 두개 비교해서 없는것 찾기 => 정렬이용하면 비교하기 쉬워짐!!!!!!!!
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        String answer = "";
        for(int i=0; i<completion.length; i++){
            if(!completion[i].equals(participant[i])){
                answer = participant[i];
                break; 
                // !!!찾았으면 멈추기!!!
                // 이걸 왜 놓쳤징 .....ㅠㅠㅠㅠㅠㅠㅠㅠㅠ
                // participant 인덱스 하나씩 밀려있기때문에 안멈추면 엉뚱한 답이 뽑힘..
            }
        }
        
        if(answer.equals("")){
            answer = participant[participant.length-1];
        }
        
        return answer;
    }
}
