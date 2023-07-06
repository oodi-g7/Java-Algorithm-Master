package com.study.javaalgorithm.baekjoon.step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2558 {
    // 230628 : 14264KB | 124ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(a+b);
    }
}
