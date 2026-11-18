/* class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            int n=nums[i];
            for(int j=0;j<nums.length;j++)
            {
                if(n>nums[j])
                {
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
} */


class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] freq = new int[101];

        // Step 1: Count frequency of every number
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        // Step 2: Calculate prefix frequency
        for (int i = 1; i < 101; i++) {
            freq[i] = freq[i] + freq[i - 1];
        }

        // Step 3: Build answer
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                ans[i] = 0;
            } else {
                ans[i] = freq[nums[i] - 1];
            }
        }

        return ans;
    }
}