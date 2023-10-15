package com.study.algo.programmers;

// 키패드 누르기

// 이 전화 키패드에서 왼손과 오른손의 엄지손가락만을 이용해서 숫자만을 입력하려고 합니다.
// 맨 처음 왼손 엄지손가락은 * 키패드에 오른손 엄지손가락은 # 키패드 위치에서 시작하며, 엄지손가락을 사용하는 규칙은 다음과 같습니다.
// 1. 엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
// 2. 왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
// 3. 오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
// 4. 가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
// 4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.
// 순서대로 누를 번호가 담긴 배열 numbers, 왼손잡이인지 오른손잡이인 지를 나타내는 문자열 hand가 매개변수로 주어질 때, 
// 각 번호를 누른 엄지손가락이 왼손인 지 오른손인 지를 나타내는 연속된 문자열 형태로 return 하도록 solution 함수를 완성해주세요.

// numbers 배열의 크기는 1 이상 1,000 이하입니다.
// numbers 배열 원소의 값은 0 이상 9 이하인 정수입니다.
// hand는 "left" 또는 "right" 입니다.
// "left"는 왼손잡이, "right"는 오른손잡이를 의미합니다.
// 왼손 엄지손가락을 사용한 경우는 L, 오른손 엄지손가락을 사용한 경우는 R을 순서대로 이어붙여 문자열 형태로 return 해주세요.
public class n057 {
    static int leftX = 3;
    static int leftY = 0;
    static int rightX = 3;
    static int rightY = 2;
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        for(int i=0; i<numbers.length; i++){
            int num = numbers[i];
            switch(num){
                case 1 :
                    leftX = 0;
                    leftY = 0;
                    answer += "L";
                    break;
                case 4 :
                    leftX = 1;
                    leftY = 0;
                    answer += "L";
                    break;
                case 7 :
                    leftX = 2;
                    leftY = 0;
                    answer += "L";
                    break;
                case 3 :
                    rightX = 0;
                    rightY = 2;
                    answer += "R";
                    break;
                case 6 :
                    rightX = 1;
                    rightY = 2;
                    answer += "R";
                    break;
                case 9 :
                    rightX = 2;
                    rightY = 2;
                    answer += "R";
                    break;
                case 2 :
                    answer += calc(0, 1, hand);
                    break;
                case 5 :
                    answer += calc(1, 1, hand);
                    break;
                case 8 :
                    answer += calc(2, 1, hand);
                    break;
                case 0 :
                    answer += calc(3, 1, hand);
                    break;
            }
        }
        
        return answer;
    }
    
    public String calc(int tx, int ty, String hand){
        String result = "";
        
        int moveLX = 0;
        int moveLY = 0;
        int moveRX = 0;
        int moveRY = 0;
        moveLX = (tx-leftX) < 0 ? (tx-leftX) * -1 : (tx-leftX);
        moveLY = (ty-leftY) < 0 ? (ty-leftY) * -1 : (ty-leftY);
        moveRX = (tx-rightX) < 0 ? (tx-rightX) * -1 : (tx-rightX);
        moveRY = (ty-rightY) < 0 ? (ty-rightY) * -1 : (ty-rightY);
        
        int moveL = moveLX + moveLY;
        int moveR = moveRX + moveRY;
        
        if(moveL < moveR){
            result = "L";
            leftX = tx;
            leftY = ty;
        }
        else if(moveL > moveR){
            result = "R";
            rightX = tx;
            rightY = ty;
        }
        else if(moveL == moveR){
            if(hand.equals("right")){
                result = "R";
                rightX = tx;
                rightY = ty;
            }
            else {
                result = "L";
                leftX = tx;
                leftY = ty;
            }
        }
        
        return result;
    }
}
