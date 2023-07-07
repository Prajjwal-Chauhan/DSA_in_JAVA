class Solution
{
    public void  Mutliply(int[][] matrixA, int[][] matrixB)
    {
        // code here
        int m = matrixA.length;
        int arr[][] = new int[m][m];
        for(int j = 0 ; j < m ; j++){
            for(int i = 0 ; i < m ; i++){
                for(int k = 0 ; k < m ; k++){
                    arr[j][i] += matrixA[j][k]*matrixB[k][i];
                }
            }
            
        }
            for(int i = 0 ; i < m ; i++){
                for(int j = 0 ; j < m ; j++){
                    matrixA[i][j] = arr[i][j];
                }
                
            }
    }
}
