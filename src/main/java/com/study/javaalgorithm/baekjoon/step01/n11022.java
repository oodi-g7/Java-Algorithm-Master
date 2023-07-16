package com.study.javaalgorithm.baekjoon.step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n11022 {
    // 230717 : 14144KB | 128ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            String str = br.readLine();  // (ex) "1 2"
            int a = str.charAt(0) - '0'; // => '1' - '0' = 49 - 48 = 1
            int b = str.charAt(2) - '0'; // => '2' - '0' = 50 - 48 = 2

            // .append() 하나에 다 입력하는 것 보다 이렇게 분리해줘서 입력하니까 속도 훨씬 빨라짐 176ms -> 128ms
            sb.append("Case #").append(i+1).append(": ").append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");
//            sb.append("Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b) + "\n");
        }
        br.close();
        System.out.println(sb.toString());
    }
}
