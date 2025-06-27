class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for (int num : nums)
            mySet.add(num);

        int result = 0;
        for (int num : nums) {
            int aux = 0, curr = num;
            while (mySet.contains(curr)) {
                aux++;
                curr++;
            }

            result = Math.max(result, aux);
        }

        return result;
    }
}