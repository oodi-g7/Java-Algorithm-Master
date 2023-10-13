package com.study.algo.programmers;

public class n011 {
    boolean solution(String s) {
        s = s.toLowerCase();
        String[] str = s.split("");
        
        int pCnt = 0;
        int yCnt = 0;
        for(int i=0; i<str.length; i++){
            switch(str[i]){
                case "p" : 
                    pCnt++;
                    break;
                case "y" :
                    yCnt++;
                    break;
            }
        }

        return pCnt == yCnt ? true : false;
    }
}
