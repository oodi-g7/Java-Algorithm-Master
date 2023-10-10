package com.study.algo.programmers;

public class n006 {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                answer += " ";
            }
            if(ch >= 'A' && ch <= 'Z'){
                if((ch+n) > 'Z'){
                    ch = (char)((ch+n-90)+64);
                }
                else{
                    ch = (char)(ch+n);
                }
                answer += ch;
            }
            else if(ch >= 'a' && ch <= 'z'){
                if((ch+n) > 'z'){
                    ch = (char)((ch+n-122)+96);
                }
                else{
                    ch = (char)(ch+n);
                }
                answer += ch;
            }
        }
        
        return answer;
    }
}
