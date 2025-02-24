package com.sezeme.chap09.api;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.print("문자열 입력 : ");
        String[] strings = sc.nextLine().split(" ");

        int count = 0;
        for(String string : strings) {
            char[] chars = string.toCharArray();
            if(chars[0] >= 'a' && chars[0] <= 'z'){
                chars[0] -= 32;
                count++;
            }
            sb.append(chars);
            sb.append(" ");
        }

        System.out.println("변환된 문자열: " + sb);
        System.out.println("총 단어 개수: " + count);
    }
}
