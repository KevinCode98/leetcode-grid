package com.griddynamics.Sliding_Window;

public class Problem_1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        int curr = 0, left = 0, ans = 0;
        for (int right = 0; right < s.length(); right++) {
            curr += Math.abs(s.charAt(right) - t.charAt(right));
            while (curr > maxCost)
                curr -= Math.abs(s.charAt(left) - t.charAt(left++));
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
