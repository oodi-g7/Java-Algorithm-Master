package com.study.javaalgorithm.baekjoon.step01;

import java.io.*;
import java.util.StringTokenizer;

public class n10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, ",");

        while(cnt-1 > 0){
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String sum = String.valueOf(a+b);

            bw.write(sum+"\n");
            cnt--;
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
