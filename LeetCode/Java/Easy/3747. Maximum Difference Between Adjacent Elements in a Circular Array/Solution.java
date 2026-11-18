/* class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = (i + 1) % nums.length;
            int diff = Math.abs(nums[i] - nums[j]);
            if (diff > max) {
                max = diff;
            }
        }
        return max;
    }
} */

class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int j = (i + 1) % nums.length;
            int diff = Math.abs(nums[i] - nums[j]);
            if (diff > max) {
                max = diff;
            }
        }
        return max;
    }
}