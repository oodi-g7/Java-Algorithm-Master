package com.study.algo.doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no010_11003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 수의 갯수
        int L = Integer.parseInt(st.nextToken());
        String[] ary = br.readLine().split(" ");
        int[] A = new int[N+1]; // N개의 수 배열
        for(int i=1; i<ary.length+1; i++){
            A[i] = Integer.parseInt(ary[i-1]);
        }

        int[] minAry = new int[N+1]; // 최솟값 배열
        int min = A[1];
        for(int i=1; i<=N; i++){
            int start_index = i-L+1;
            int end_index = i;
            if(start_index <= 0){
                start_index = 1;
            }

            if(start_index == 1){

            }

            for(int j=start_index; j<=end_index; j++){
                if(min > A[j]){
                    min = A[j];
                }
            }

            minAry[i] = min;
        }

        for(int i=1; i<=N; i++){
            System.out.print(minAry[i]);
            if(i < N){
                System.out.print(" ");
            }
        }
    }
}
