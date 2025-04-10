package com.griddynamics.Hashing;

import java.util.Arrays;

public class Problem_1657 {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;

        int[] countingWord1 = new int[26];
        for (char ch : word1.toCharArray())
            countingWord1[ch - 'a']++;

        int[] countingWord2 = new int[26];
        for (char ch : word2.toCharArray())
            countingWord2[ch - 'a']++;

        for (int i = 0; i < 26; i++) {
            if ((countingWord1[i] == 0) != (countingWord2[i] == 0))
                return false;
        }

        Arrays.sort(countingWord1);
        Arrays.sort(countingWord2);
        return Arrays.equals(countingWord1, countingWord2);
    }
}
