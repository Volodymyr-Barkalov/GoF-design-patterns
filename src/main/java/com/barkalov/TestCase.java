package com.barkalov;

import java.util.HashMap;
import java.util.Map;

public class TestCase {
    public static void main(String[] args) {
        // Sum = 12
        int[] array = {3, 6, 4, 9, 2, 8, 1, 5, 7};

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if((array[i] + array[j]) == 12) {
                    if(i != j) {
                        map.put(i, j);
                    }
                }
            }
        }

        map.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
