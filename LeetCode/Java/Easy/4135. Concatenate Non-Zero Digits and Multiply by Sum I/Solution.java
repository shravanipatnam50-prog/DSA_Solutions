class Solution {
    public long sumAndMultiply(int n) 
    {
        long x = 0;
        long sum = 0;
        long base = 1;
        while (n != 0) 
        {
            int rem = n % 10;
            if (rem != 0) 
            {
                x = rem * base + x;
                
                base *= 10;//updating base
            }
            n /= 10;
            sum += rem;
        }
        return x * sum;
    }
}