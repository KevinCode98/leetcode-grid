package com.griddynamics.Hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mapRan = new HashMap<>();
        Map<Character, Integer> mapMag = new HashMap<>();

        for (char ch : ransomNote.toCharArray())
            mapRan.put(ch, mapRan.getOrDefault(ch, 0) + 1);

        for (char ch : magazine.toCharArray())
            mapMag.put(ch, mapMag.getOrDefault(ch, 0) + 1);

        Iterator<Map.Entry<Character, Integer>> iter = mapRan.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Character, Integer> entry = iter.next();
            char letter = entry.getKey();
            if (mapRan.containsKey(letter) && mapMag.containsKey(letter)) {
                if (mapRan.get(letter) > mapMag.get(letter))
                    return false;
            } else {
                return false;
            }
        }

        return true;
    }
}
