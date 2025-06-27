package Two_Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Tree_Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int ptr = 0; ptr < nums.length; ptr++) {
            if (nums[ptr] > 0) break;
            if (ptr > 0 && nums[ptr] == nums[ptr - 1])
                continue;

            int left = ptr + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[ptr] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(List.of(nums[ptr], nums[left], nums[right]));

                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}