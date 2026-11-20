class Solution {
    public int maxSelectedElements(int[] nums) 
    {
        Arrays.sort(nums);
        HashMap<Integer, Integer> dp=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++) 
        {
            int x=nums[i];
            int a=dp.getOrDefault(x-1,0);
            int b=dp.getOrDefault(x,0);
            dp.put(x,Math.max(dp.getOrDefault(x,0),a+1));
            dp.put(x+1,Math.max(dp.getOrDefault(x+1,0),b+1));
            ans=Math.max(ans,Math.max(dp.get(x),dp.get(x+1)));
        }
        return ans;
    }
}