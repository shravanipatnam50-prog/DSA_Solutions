//Brute force
/* class Solution {
    public int[] runningSum(int[] nums) {
        int[] temp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=0;j<=i;j++)
            {
                sum=sum+nums[j];
            }
            temp[i]=sum;
        }
        return temp;
    }
} */


//Prefix Sum
/*
class Solution {
    public int[] runningSum(int[] nums) {
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
        return prefix;
    }
}
*/


//using one sum variable
//more optimal than prefix sum
class Solution {
    public int[] runningSum(int[] nums) 
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}