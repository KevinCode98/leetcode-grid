package com.griddynamics.Hashing;

import java.util.Arrays;

public class Problem_2351 {
    public char repeatedCharacter(String s) {
        boolean[] isRepeated = new boolean[26];
        Arrays.fill(isRepeated, false);

        for (char ch : s.toCharArray()) {
            if (isRepeated[ch - 'a'])
                return ch;
            isRepeated[ch - 'a'] = true;
        }

        return ' ';
    }
}
