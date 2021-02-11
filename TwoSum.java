import java.util.*;

public class TwoSum {

    public static void main(String args[]) {
        int arr[] = {-1,-2,-3,-4,-5};
        int target = -8;
        twoSum(arr,target);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num_map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (num_map.containsKey(complement)) {
                return new int[] { num_map.get(complement), i };
            }
            num_map.put(nums[i], i);

        }
        throw new IllegalArgumentException("no match found!");
    }
}
