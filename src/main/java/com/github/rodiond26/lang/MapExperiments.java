package com.github.rodiond26.lang;

import java.util.HashMap;
import java.util.Map;

public class MapExperiments {
    public static void main(String[] args) {
        Map<int[], String> map= new HashMap<>();

        int[] a = {1, 2};
        map.put(a, "a1");

        System.out.println(map);
        a[1] = 3;
        System.out.println(map.get(a));


    }
}
