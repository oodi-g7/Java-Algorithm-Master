package com.study.algo.baekjoon.step01;

import java.io.*;
import java.util.StringTokenizer;

public class n10950 {
    // 230628 : 14200KB | 124ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());

        for(int i=0; i<cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String sum = String.valueOf(a+b);
            bw.write(sum);
            if (i < cnt - 1) {
                bw.newLine();
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }

    // 230628 : 14196KB | 124ms
    public void main2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());

        for(int i=0; i<cnt; i++) {
            String[] str = (br.readLine()).split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            String sum = String.valueOf(a+b);
            bw.write(sum);
            if (i < cnt - 1) {
                bw.newLine();
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
