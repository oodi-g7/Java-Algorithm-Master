package com.study.javaalgorithm.baekjoon.step01;

import java.io.*;
import java.util.Scanner;

public class n10953 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cnt = scn.nextInt();

        for (int i=0; i<cnt; i++) {
            String str = scn.next();
            int a = Integer.parseInt(str.split(",")[0]);
            int b = Integer.parseInt(str.split(",")[1]);

            System.out.println(a + b);
        }
    }

    public void case_one() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());

        for (int i=0; i<cnt; i++){
            String s = br.readLine();
            int a = Integer.parseInt(s.split(",")[0]);
            int b = Integer.parseInt(s.split(",")[1]);
            String sum = String.valueOf(a+b);

            bw.write(sum+"\n");
        }
        bw.flush();

        bw.close();
        br.close();
    }
}
