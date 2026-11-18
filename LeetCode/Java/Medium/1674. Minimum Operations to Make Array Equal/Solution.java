class Solution {
    public int minOperations(int n) {
        int ans = 0;
        int target = n;   // middle value
        for(int i = 0; i < n/2; i++) {
            int value = 2*i + 1;
            ans += target - value;
        }
        return ans;
    }
}