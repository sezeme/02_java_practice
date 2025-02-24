package com.sezeme.chap09.api;

import java.lang.reflect.Array;
import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        System.out.print("문자열 입력 : ");
        String s = sc.nextLine().toLowerCase();
        st = new StringTokenizer(s, " !");

        ArrayList<String> strings = new ArrayList<>();
        while (st.hasMoreTokens()) {
            strings.add(st.nextToken());
        }

        HashMap<String, Integer> map = new HashMap<>();
        for(String string : strings) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        System.out.println("==== 단어 빈도 ====");
        for(int i = 0; i<3; i++){
            System.out.println(keySet.get(i) + " : " + map.get(keySet.get(i)));
        }
        System.out.println("가장 빈도 높은 단어 : " + keySet.get(0) + " (" + map.get(keySet.get(0)) + " 번)");


    }
}
