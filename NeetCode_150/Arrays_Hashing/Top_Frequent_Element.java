class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int num : nums)
            myMap.put(num, myMap.getOrDefault(num, 0) + 1);

        PriorityQueue<Integer[]> myQueue = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (var aux : myMap.entrySet())
            myQueue.add(new Integer[]{aux.getKey(), aux.getValue()});

        int[] result = new int[k];
        for (int i = 0; i < k; i++)
            result[i] = myQueue.poll()[0];

        return result;
    }
}