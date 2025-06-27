class Solution {
    Map<Integer, String> myMap = new HashMap<>();

    public String encode(List<String> strs) {
        String result = "";
        for (int i = 0; i < strs.size(); i++) {
            myMap.put(i, strs.get(i));
            result += strs.get(i);
        }

        return result;
    }


    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < myMap.length(); i++)
            result.add(myMap.get(i));

        return result;
    }
}