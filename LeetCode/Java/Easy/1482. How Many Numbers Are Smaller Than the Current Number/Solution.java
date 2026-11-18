class Solution {
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
}