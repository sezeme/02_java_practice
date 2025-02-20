package com.sezeme.chap05.array.level04.advanced;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        int[] iarr = new int[4];
        Random rand = new Random();

        int idx = 0;

        while(idx < 4){
            int newNumber = rand.nextInt(0,10);
            boolean flag = false;
            for(int num : iarr) {
                if (num == newNumber) {
                    flag = true;
                    break;
                }
            }
            if(flag) continue;
            iarr[idx++] = newNumber;
        }

        int count = 10;
        while(count > 0){
            System.out.println(count + "회 남으셨습니다.");
            System.out.print("4자리 숫자를 입력하세요 : ");
            int[] input = {};
            try {
                input = getAnswer();
            } catch (Exception e) {
                System.out.println("4자리의 정수를 입력해야 합니다.");
                continue;
            }

            int strike = 0, ball = 0;
            for(int i = 0; i<iarr.length; i++){
                for(int j = 0; j < input.length; j++){
                    if(iarr[i] == input[j]) {
                        if(i == j) strike++;
                        else ball++;
                    }
                }
            }
            if(strike == 4) {
                System.out.println("정답입니다.");
                break;
            } else {
                System.out.println("아쉽네요. " + strike + "S " + ball + "B 입니다.");
                count--;
            }

        }

        if(count <= 0) System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
    }

    public static int[] getAnswer() throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(String.valueOf(input).length() != 4 ) {
            throw new IllegalArgumentException("4자리의 정수를 입력해야 합니다.");
        }
        int[] iarr = new int[4];
        String str = String.valueOf(input);
        for(int i = 0; i<iarr.length; i++){
            iarr[i] = str.charAt(i) - '0';
        }
        return iarr;
    }
}
