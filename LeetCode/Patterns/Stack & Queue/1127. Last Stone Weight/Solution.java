class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        int ans;
        while(n>1)
        {
            Arrays.sort(stones);
            int max1=stones[n-1];
            int max2=stones[n-2];
            if(max1 == max2)
            {
                n=n-2;
            }
            if(max1 != max2)
            {
                ans=max1-max2;
                stones[n-2]=ans;
                n=n-1;
            }
        }
        if(n == 0)
        {
            return 0;
        }
        return stones[0];
    }
}