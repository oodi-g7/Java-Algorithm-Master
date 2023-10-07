package com.study.algo.nh_cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no009_12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long S = Integer.parseInt(st.nextToken());
        long P = Integer.parseInt(st.nextToken());

        String[] str = br.readLine().split("");

        st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st.nextToken());
        long G = Integer.parseInt(st.nextToken());
        long T = Integer.parseInt(st.nextToken());

        long count = 0;
        long aCnt = 0;
        long cCnt = 0;
        long gCnt = 0;
        long tCnt = 0;
//        for(long i=0; i<S-(P-1); i++){
//            for(long j=i; j<P; j++){
//                switch (str[j]){
//                    case "A":
//                        aCnt++;
//                }
//            }
//        }
        System.out.println(count);
    }
}
