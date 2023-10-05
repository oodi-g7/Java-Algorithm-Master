package com.study.algo.baekjoon.step01;

import java.io.*;


public class n11718_n11719 {
    // [n11718] 230717 : 14224KB | 128ms
    // [n11719] 230717 : 14168KB | 124ms
    // 11718에서는 입력값에 공백이 없었는데, 11719에서는 공백에 추가됨.
    // 그러나 ***BufferedReader는 공백 또한 값으로 인식***하므로, != null 조건에 부합함.
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
