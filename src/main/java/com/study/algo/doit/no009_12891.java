package com.study.algo.doit;

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

        String[] dna = br.readLine().split("");
        String[] cntChk = br.readLine().split(" ");
        int[] check = new int[4];
        for(int i=0; i<4; i++){
            check[i] = Integer.parseInt(cntChk[i]);
        }

        int count = 0;
        for(int i=0; i<S-(P-1); i++){
            long aCnt = check[0];
            long cCnt = check[1];
            long gCnt = check[2];
            long tCnt = check[3];
            for(int j=i; j<i+P; j++){
                switch (dna[j]){
                    case "A" :
                        aCnt--;
                        break;
                    case "C" :
                        cCnt--;
                        break;
                    case "G" :
                        gCnt--;
                        break;
                    case "T" :
                        tCnt--;
                        break;
                }
            }

            if(aCnt == 0 && cCnt == 0 && gCnt == 0 && tCnt == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
