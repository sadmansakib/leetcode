/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        int curr = x;
        int reversed = 0;
        while (curr > 0) {
            reversed = (reversed * 10) + (curr % 10);
            curr /= 10;
        }

        return reversed == x;
    }
}
// @lc code=end
