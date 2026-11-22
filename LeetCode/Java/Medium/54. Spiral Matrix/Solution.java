class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int top=0;//it represents the 1st row which we haven't visited yet
        int bottom=matrix.length-1;//it represents no.of rows
        int left=0;//1st column that we haven't visited yet
        int right=matrix[0].length-1;//no.of columns in 1st row
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                res.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                res.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--) 
                {
                    res.add(matrix[i][left]);
                }
                left++;
            }

        }
        return res;
    }
}