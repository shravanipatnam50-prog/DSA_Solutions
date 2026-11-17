class Solution {
public:
    int maxSubArray(vector<int>& nums)
    {
        int cusum = 0;
        int maxsum = INT_MIN;
        for(int i = 0; i < nums.size(); i++)
        {
            cusum = cusum + nums[i];
            maxsum = max(cusum, maxsum);

            if(cusum < 0)
            {
                cusum = 0;
            }
        }
        return maxsum;
    }
};