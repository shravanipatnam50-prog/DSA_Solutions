class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e_c) {
        List<Boolean> result=new ArrayList<>();
        int[] temp=new int[c.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]>max)
            {
                max=c[i];
            }
        }
        for(int i=0;i<c.length;i++)
        {
            temp[i]=c[i]+e_c;
        }
        for(int i=0;i<c.length;i++)
        {
            if(temp[i]>=max)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        return result;
    }
}