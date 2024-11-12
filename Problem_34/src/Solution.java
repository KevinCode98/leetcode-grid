public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length <= 1) {
            if (nums.length != 0 && target == nums[0])
                return new int[]{0, 0};
            return new int[]{-1, -1};
        }

        // Trying to use Binary search
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            if (nums[left] == target && nums[right] == target)
                return new int[]{left, right};

            if (target < nums[right])
                right--;

            if (target > nums[left])
                left++;
        }

        return new int[]{-1, -1};
    }
}
