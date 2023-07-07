class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        int i = 0;

        while(i < n){
            sum += mat[i][i] + mat[i][n-i-1];
            i++;
        }

        if(n%2==0) return sum;

        return sum - mat[n/2][n/2];
    }
}
