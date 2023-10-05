package com.study.javaalgorithm.baekjoon.nh_cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class no_003 {
    public static void main(String[] args) throws IOException {
        // 구간합 공식 => S[i] = S[i-1] + S[i]
        // i ~ j까지 부분합 공식 => S[j] - S[i-i]
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] S = new long[n+1];
        st = new StringTokenizer(br.readLine());
        // 합 배열 만들기
        for(int i=1; i<=n; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }
        // 구간 합 구하기
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(S[b] - S[a-1]);
        }
    }
}
