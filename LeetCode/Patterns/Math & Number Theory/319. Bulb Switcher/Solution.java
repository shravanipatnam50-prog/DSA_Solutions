class Solution {
    public int bulbSwitch(int n) {
        int[] arr=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j+=i)
            {
                if(arr[j]==1)
                {
                    arr[j]=0;
                }
                else
                {
                    arr[j]=1;
                }
            }
        }
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
        }
        return count;
    }
}