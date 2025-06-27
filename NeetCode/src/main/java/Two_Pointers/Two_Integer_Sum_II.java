package Two_Pointers;

class Two_Integer_Sum_II {
    public int[] twoSum(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target)
                return new int[]{nums[start], nums[end]};

            else if (target > sum)
                start++;
            else
                end--;
        }

        return new int[]{0, 0};
    }
}