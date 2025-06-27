package Arrays_Hashing;

import java.util.HashSet;
import java.util.Set;

class Contains_Duplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();

        for (int num : nums) {
            if (mySet.contains(num))
                return true;
            else
                mySet.add(num);
        }

        return false;
    }
}