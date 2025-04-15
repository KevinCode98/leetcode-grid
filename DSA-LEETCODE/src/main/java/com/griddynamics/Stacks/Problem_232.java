package com.griddynamics.Stacks;

public class Problem_232 {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sAux = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '#' && !sAux.isEmpty())
                sAux.deleteCharAt(sAux.length() - 1);
            else {
                if (ch != '#')
                    sAux.append(ch);
            }
        }

        StringBuilder tAux = new StringBuilder();
        for (char ch : t.toCharArray()) {
            if (ch == '#' && !tAux.isEmpty())
                tAux.deleteCharAt(tAux.length() - 1);
            else {
                if (ch != '#')
                    tAux.append(ch);
            }
        }

        return sAux.toString().equals(tAux.toString());
    }
}
