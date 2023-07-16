package com.study.javaalgorithm.baekjoon.step01;

import java.io.*;

// 230717 : 14224KB | 128ms
public class n11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while((str = br.readLine()) != null){
            sb.append(str).append("\n");
        }
        br.close();

        System.out.println(sb.toString());
    }
}
