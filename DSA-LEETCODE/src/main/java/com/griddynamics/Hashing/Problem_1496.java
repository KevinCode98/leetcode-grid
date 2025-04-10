package com.griddynamics.Hashing;

import java.util.HashSet;
import java.util.Set;

record PosRecord(int x, int y) {
}

public class Problem_1496 {
    public boolean isPathCrossing(String path) {
        Set<PosRecord> mySet = new HashSet<>();
        mySet.add(new PosRecord(0, 0));

        int x = 0, y = 0;
        for (char ch : path.toCharArray()) {
            switch (ch) {
                case 'N' -> y++;
                case 'S' -> y--;
                case 'E' -> x--;
                case 'W' -> x++;
            }

            PosRecord aux = new PosRecord(x, y);
            if (mySet.contains(aux))
                return true;

            mySet.add(aux);
        }

        return false;
    }
}
