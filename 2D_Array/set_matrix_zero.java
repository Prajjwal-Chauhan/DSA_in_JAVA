class Solution {
    public void setZeroes(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int rowArr[]=new int[m];
        int colArr[]=new int[n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    rowArr[i]=-1;
                    colArr[j]=-1;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(rowArr[i]==-1 && colArr[j]==-1)
                {
                    //to change col
                    for(int row=0;row<m;row++)
                    {
                        arr[row][j]=0;
                    }
                    //to change row
                    for(int col=0;col<n;col++)
                    {
                        arr[i][col]=0;
                    }
                }
            }
        }
    }
}
