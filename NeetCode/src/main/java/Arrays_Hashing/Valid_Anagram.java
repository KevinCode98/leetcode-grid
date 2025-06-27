package Arrays_Hashing;

import java.util.Arrays;

class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] sCh = s.toCharArray();
        char[] tCh = t.toCharArray();

        Arrays.sort(sCh);
        Arrays.sort(tCh);

        for (int i = 0; i < sCh.length; i++) {
            if (sCh[i] != tCh[i])
                return false;
        }

        return true;
    }
}