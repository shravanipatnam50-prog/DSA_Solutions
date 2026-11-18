/*
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int min_index = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[min_Index]) {
                min_Index = i;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            int curr = (min_Index + i) % n;
            int next = (min_Index + i + 1) % n;
            if (nums[curr] > nums[next]) {
                return false;
            }
        }
        return true;
    }
}*/


class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }
}