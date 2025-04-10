package com.griddynamics.Counting;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem_791 {
    public String customSortString(String order, String s) {
        StringBuilder str = new StringBuilder();
        Map<Character, Integer> letters = new HashMap<>();

        for (char ch : s.toCharArray())
            letters.put(ch, letters.getOrDefault(ch, 0) + 1);

        for (char ch : order.toCharArray()) {
            if (letters.containsKey(ch)) {
                String aux = "" + ch;
                str.append(aux.repeat(letters.get(ch)));
                letters.remove(ch);
            }
        }

        Iterator<Map.Entry<Character, Integer>> itr = letters.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Character, Integer> entry = itr.next();

            String aux = "" + entry.getKey();
            str.append(aux.repeat(entry.getValue()));
            itr.remove();
        }

        return str.toString();
    }
}