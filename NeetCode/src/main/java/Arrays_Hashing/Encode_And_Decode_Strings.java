package Arrays_Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Encode_And_Decode_Strings {
    Map<Integer, StringBuilder> myMap = new HashMap<>();

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            myMap.put(i, new StringBuilder(strs.get(i)));
            result.append(myMap.get(i));
        }

        return result.toString();
    }


    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < myMap.size(); i++)
            result.add(myMap.get(i).toString());

        return result;
    }
}