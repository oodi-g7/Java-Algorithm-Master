package com.study.javaalgorithm.baekjoon.step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1000 {
    // 230626 : 14240KB | 136ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = (br.readLine()).split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        System.out.println(a+b);
    }
}
