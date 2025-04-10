package com.griddynamics.Counting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem_2225 {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> teams = new HashMap<>();

        for (int[] match : matches) {
            teams.putIfAbsent(match[0], 0);
            teams.put(match[1], teams.getOrDefault(match[1], 0) + 1);
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        for (var team : teams.entrySet()) {
            if (team.getValue() == 0)
                result.get(0).add(team.getKey());
            if (team.getValue() == 1)
                result.get(1).add(team.getKey());
        }

        return result;
    }
}
