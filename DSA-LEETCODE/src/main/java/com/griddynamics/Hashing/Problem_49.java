package com.griddynamics.Hashing;

import java.util.*;

public class Problem_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>();

        for (String str : strs) {
            // Sort String
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String auxStr = new String(chars);

            myMap.putIfAbsent(auxStr, new ArrayList<>());
            myMap.get(auxStr).add(str);
        }

        return new ArrayList<>(myMap.values());
    }
}
