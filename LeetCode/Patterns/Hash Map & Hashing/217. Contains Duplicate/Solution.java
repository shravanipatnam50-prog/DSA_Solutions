//TLE
/*
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i] == nums[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
}
*/
class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<i;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count>0)
            {
                return true;
            }
        }
        return false;
    }
}