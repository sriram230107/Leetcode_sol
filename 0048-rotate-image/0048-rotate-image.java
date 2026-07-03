class Solution {
    public void rotate(int[][] matrix) {
        int [][] a=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            int k=0;
            for(int j=matrix.length-1;j>=0;j--)
            {
                a[k][matrix.length-1-i]=matrix[i][k];
                k++;
            }
            
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=matrix.length-1;j>=0;j--)
            {
                matrix[i][j]=a[i][j];
            }
            
        }

        
    }
}