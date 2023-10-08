package com.study.algo.doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no007_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A[] = new int[N];
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                int sum = A[i] + A[j];
                if(sum == M){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
