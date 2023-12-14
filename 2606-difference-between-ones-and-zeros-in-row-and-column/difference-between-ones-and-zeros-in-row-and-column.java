class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] diff=new int[n][m];
        int[] onesRow=new int[n];
        int[] onesCol=new int[m];

        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                onesRow[i]+=grid[i][j];
                onesCol[j]+=grid[i][j];
            }
        }

        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                diff[i][j]=2*onesRow[i]+2*onesCol[j]-n-m;
            }
        }

        return diff;
    }
}