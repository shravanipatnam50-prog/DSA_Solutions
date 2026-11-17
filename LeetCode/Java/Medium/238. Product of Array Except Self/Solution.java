class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] pre_pro=new int[n];
        int[] suf_pro=new int[n];
        int[] ans=new int[n];
        pre_pro[0]=1;
        for(int i=1;i<n;i++)
        {
            pre_pro[i]=pre_pro[i-1]*nums[i-1];
        }
        suf_pro[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            suf_pro[i]=suf_pro[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++)
        {
            ans[i]=pre_pro[i]*suf_pro[i];
        }
        return ans;
    }
}