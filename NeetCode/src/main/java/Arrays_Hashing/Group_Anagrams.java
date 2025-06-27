package Arrays_Hashing;

import java.util.*;

class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>();

        for (String s : strs) {
            char[] aux = s.toCharArray();
            Arrays.sort(aux);

            String strAux = new String(aux);
            myMap.putIfAbsent(strAux, new ArrayList<>());
            myMap.get(strAux).add(s);
        }

        return new ArrayList<>(myMap.values());
    }
}