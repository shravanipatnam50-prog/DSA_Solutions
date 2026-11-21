class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        while(n > 1) {
            Arrays.sort(stones);
            int max1 = stones[n - 1];
            int max2 = stones[n - 2];
            if(max1 == max2) 
            {
                n = n - 2;
            }
            else 
            {
                stones[n - 2] = max1 - max2;
                n = n - 1;
            }
        }
        if(n == 0) 
        {
            return 0;
        }
        return stones[0];
    }
}
