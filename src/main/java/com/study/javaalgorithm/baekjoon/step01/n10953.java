package com.study.javaalgorithm.baekjoon.step01;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class n10953 {
    // 230706 : 14296KB | 128ms
    public static void main0(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;

        int cnt = Integer.parseInt(br.readLine());

        for (int i=0; i<cnt; i++){
            str = br.readLine();
            st = new StringTokenizer(str, ",");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            String sum = String.valueOf(a+b);

            if (i == cnt-1){
                bw.write(sum);
            }else {
                bw.write(sum + "\n");
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }

    // 230706 : 14096KB | 140ms
    // https://onlyfor-me-blog.tistory.com/317
    public static void main2(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<cnt; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), ",");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }
        br.close();

        System.out.println(sb.toString());
    }

    // 230706 : 141206KB | 120ms
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        int cnt = Integer.parseInt(br.readLine());
        for (int i=0; i<cnt; i++){
            str = br.readLine();
            sb.append((str.charAt(0)-'0') + (str.charAt(2)-'0')).append("\n");
        }

        System.out.println(sb.toString());

        br.close();
    }
}
