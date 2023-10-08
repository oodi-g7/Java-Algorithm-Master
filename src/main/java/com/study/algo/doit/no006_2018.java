package com.study.algo.doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no006_2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int start = 1; // 시작인덱스
        int end = 1; // 종료인덱스
        int sum = 1; // while문의 처음은 시작인덱스, 종료인덱스 모두 숫자1을 가리키고 있으므로
        int count = 1; // while문의 조건이 end != N이므로, N인 경우 1은 미리 갖고 있기
        while (end != N){
            if(sum > N){ // N보다 커
                sum -= start; // 구간줄이기
                start++; // 시작인덱스 +1
            }
            else if(sum < N){ // N보다 부족해
                end++; // 종료인덱스 +1
                sum += end; // 구간늘이기
            }
            else if(sum == N){ // N이랑 같아
                end++; // 종료인덱스 +1
                sum += end; // 구간늘이기
                count++; // 카운트 +1
            }
        }
        System.out.println(count);
    }
}
