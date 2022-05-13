import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapping = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (mapping.containsKey(remaining))
                return new int[] { i, mapping.get(remaining) };
            mapping.put(nums[i], i);
        }

        return null;
    }
}
// @lc code=end
