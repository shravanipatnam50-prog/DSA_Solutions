class Solution {
    public int findCenter(int[][] mat) {
        if (mat[0][0] == mat[1][0]) {
            return mat[0][0];
        }
        else if (mat[0][0] == mat[1][1]) {
            return mat[0][0];
        }
        else {
            return mat[0][1];
        }
    }
}