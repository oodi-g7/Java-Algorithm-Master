package com.study.javaalgorithm.baekjoon.nh_cote;

import java.util.Scanner;

public class no_002 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int scores[] = new int[n];
        for(int i=0; i<n; i++){
            scores[i] = scn.nextInt();
        }

        int sum = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            int score = scores[i];
            sum += score;
            if(score > max){
                max = score;
            }
        }

        double avg = sum * 100.0 / max / n;
        System.out.println(avg);
    }
}
