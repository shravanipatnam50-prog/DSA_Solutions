/*
class Solution {
    public int[] transformArray(int[] nums) {
    for(int i=0;i<nums.length;i++)
    {
       if(nums[i]%2==0)
        {
            nums[i]=0;
        }
        else
        {
            nums[i]=1;
        }
    }
        Arrays.sort(nums);
        return nums;
    }
}
*/

class Solution {
    public int[] transformArray(int[] nums) {
        int even = 0;
        int odd = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        int[] ans = new int[nums.length];
        for(int i = 0; i < even; i++) {
            ans[i] = 0;
        }
        for(int i = even; i < nums.length; i++) {
            ans[i] = 1;
        }
        return ans;
    }
}

