class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] tg=new int[n+1];//trustGiven=tg
        int[] tr=new int[n+1];//trustReceived=tr
        for(int i=0;i<trust.length;i++)
        {
            int a=trust[i][0];
            int b=trust[i][1];
            tg[a]++;
            tr[b]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(tg[i] == 0 && tr[i] == n-1)
            {
                return i;
            }
        }
        return -1;
    }
}