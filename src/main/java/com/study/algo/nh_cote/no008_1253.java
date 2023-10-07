package com.study.algo.nh_cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no008_1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A[] = new long[N];
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int count = 0;
        for(int k=0; k<N; k++){
            long find = A[k];
            int i = 0;
            int j = N-1;

            while(i<j){
                long sum = A[i] + A[j];
                if(sum == find){
                    if(i != k && j != k){ // 좋은 수 만들기에 자기자신은 포함될 수 없음
                        count++;
                        break; // while문 벗어남. for문 k++
                    }
                    else if(i == k){
                        i++;
                    }
                    else if(j == k){
                        j--;
                    }
                }
                else if(sum < find){
                    i++;
                }
                else if(sum > find){
                    j--;
                }
            }
        }
        System.out.println(count);
    }
}
