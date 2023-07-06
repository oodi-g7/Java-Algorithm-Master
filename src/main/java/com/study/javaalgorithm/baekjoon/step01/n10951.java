package com.study.javaalgorithm.baekjoon.step01;

import java.io.*;
import java.util.StringTokenizer;

public class n10951 {
    // 230628 : 14272KB | 128ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;

        while( (str=br.readLine()) != null ){
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a+b;
            bw.write(String.valueOf(sum)+"\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}