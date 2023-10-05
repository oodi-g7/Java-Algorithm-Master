package com.study.algo.baekjoon.step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class n11021 {
    // 230717 : 14176KB | 120ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        
        // charAt(i) - '0' 이유
        // 1 1 => str.charAt(0) => '1' =  49 (문자열 1은 49)
        // str.charAt(0) - '0' => '0' = 48 (문자열 0은 48)
        // => str.charAt(0)-'0'=1 ("1 1" 에서 str.charAt(0)은 "1"이니까 49, 여기에 문자열"0"을 빼주면 49-48=1 !!)
        for (int i=0; i<t; i++){
            String str = br.readLine();
            sb.append("Case #").append(i+1).append(": ")
                    .append(str.charAt(0)-'0'+str.charAt(2)-'0').append('\n');
        }
        br.close();

        System.out.println(sb.toString());
    }

    // 230717 : 16124KB | 152ms
    public static void main1(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine(), " ");
            sb.append("Case #" + (i+1) + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        br.close();

        System.out.println(sb.toString());
    }
}
