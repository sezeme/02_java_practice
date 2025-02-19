package com.sezeme.chap04.conditional.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kor, eng, math;
        System.out.print("국어 점수를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        math = sc.nextInt();

        System.out.println("\n");

        double avg = (kor + eng + math) / 3.0;
        if (avg < 60) {
            System.out.println("평균 점수 미달로 불합격입니다.");
        }
        if (kor < 40) System.out.println("국어 점수 미달로 불합격입니다.");
        if (eng < 40) System.out.println("영어 점수 미달로 불합격입니다.");
        if (math < 40) System.out.println("수학 점수 미달로 불합격입니다.");

    }
}
