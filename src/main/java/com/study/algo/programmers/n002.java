package com.study.algo.programmers;

public class n002 {
    public int[] solution(int n) {
        int ary[][] = new int[n][n];
        
        int x = -1;
        int y = 0;
        int num = 1;
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(i % 3 == 0){ // 아래
                    x++;
                }
                else if(i % 3 == 1){ // 오른쪽
                    y++;
                    
                }
                else if(i % 3 == 2){ // 대각선
                    x--;
                    y--;
                }
                ary[x][y] = num++;
            }
        }
        
        int[] answer = new int[n*(n+1)/2]; // 삼각형 크기
        int index = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(ary[i][j] == 0){
                    break;
                }
                else{
                    answer[index++] = ary[i][j];
                }
            }
        }
        return answer;
    }
}
