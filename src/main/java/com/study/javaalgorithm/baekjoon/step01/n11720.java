package com.study.javaalgorithm.baekjoon.step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n11720 {
    // 230723 : 14260KB 124ms
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        char[] ch = br.readLine().toCharArray();
        int sum = 0;

        for (int i=0; i<t; i++){
            sum += Character.getNumericValue(ch[i]);
        }

        System.out.println(sum);
    }


    // 230723 : 14316KB 132ms
    public static void main1(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");

        int sum = 0;
        for (int i=0; i<t; i++){
            sum += Integer.parseInt(str[i]);
        }
        System.out.println(sum);
    }
}
