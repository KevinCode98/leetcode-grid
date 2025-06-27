package Arrays_Hashing;

import java.util.Arrays;

class Products_Of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int aux;
        int[] postfix = new int[n];
        int[] prefix = new int[n];

        Arrays.fill(postfix, 1);
        Arrays.fill(prefix, 1);

        aux = 1;
        for (int i = 1; i < n; i++) {
            aux = aux * nums[i - 1];
            prefix[i] = aux;
        }

        aux = 1;
        for (int i = n - 2; i >= 0; i--) {
            aux = aux * nums[i + 1];
            postfix[i] = aux;
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++)
            result[i] = prefix[i] * postfix[i];

        return result;
    }
}