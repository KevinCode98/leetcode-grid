package com.griddynamics.Hashing;

import java.util.HashSet;
import java.util.Set;

public class Problem_1832 {
    public boolean checkIfPangram(String sentence) {
        Set<Character> letters = new HashSet<>();

        for (char c : sentence.toCharArray())
            letters.add(c);
        return letters.size() == 26;
    }
}
