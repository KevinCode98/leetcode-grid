package com.griddynamics.Hashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem_1436 {
    public String destCity(List<List<String>> paths) {
        Map<String, Integer> graph = new HashMap<>();

        for (List<String> aux : paths) {
            graph.putIfAbsent(aux.get(0), 0);
            graph.putIfAbsent(aux.get(1), 0);

            graph.put(aux.get(0), graph.getOrDefault(aux.get(0), 0) + 1);
        }

        String result = "";
        for (var aux : graph.entrySet()) {
            if (aux.getValue() == 0)
                result = aux.getKey();
        }

        return result;
    }
}
