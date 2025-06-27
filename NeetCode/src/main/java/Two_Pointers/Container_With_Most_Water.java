package Two_Pointers;

class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            max = Math.max(max, minHeight * (right - left));

            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return max;
    }
}