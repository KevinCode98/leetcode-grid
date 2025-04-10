package com.griddynamics;

public class Problem_34 {
    public int[] searchRange(int[] nums, int target) {
        // Using an BinarySearch method
        int findFirst = this.findBound(nums, target, true);

        if (findFirst == -1)
            return new int[]{-1, -1};

        int findSecond = this.findBound(nums, target, false);

        return new int[]{findFirst, findSecond};
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int N = nums.length;
        int start = 0, end = N - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                if (isFirst) {
                    if (mid == start || nums[mid - 1] != target)
                        return mid;
                    end = mid - 1;
                } else {
                    if (mid == end || nums[mid + 1] != target)
                        return mid;

                    start = mid + 1;
                }
            } else if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }
//    public int[] searchRange(int[] nums, int target) {
//        if (nums.length <= 1) {
//            if (nums.length != 0 && target == nums[0])
//                return new int[]{0, 0};
//            return new int[]{-1, -1};
//        }
//
//        // Trying to use Binary search
//        int left = 0, right = nums.length - 1;
//
//        while (left <= right) {
//            if (nums[left] == target && nums[right] == target)
//                return new int[]{left, right};
//
//            if (target < nums[right])
//                right--;
//
//            if (target > nums[left])
//                left++;
//        }
//
//        return new int[]{-1, -1};
//    }
}
