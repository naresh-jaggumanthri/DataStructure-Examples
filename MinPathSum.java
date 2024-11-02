import java.util.Arrays;

public class MinPathSum {
    public static void main(String[] args) {
        MinPathSum m=new MinPathSum();
        int input[][]={{1,3,1},{1,5,1},{4,2,1}};
        int result=m.minPathSum(input);
       

        System.out.println("Result is :"+result); 
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        int minSum=0;
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
      
        minSum=recMinPath(0,0,grid,dp);
        
        return minSum;
    }
    public int recMinPath(int i,int j,int[][] grid,int[][] dp){
        //base condition
        if(i<0||j<0||i==grid.length||j==grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==grid.length-1&&j==grid[0].length-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int right=recMinPath(i+1,j,grid,dp);
        int down=recMinPath(i,j+1,grid,dp);
        
        return dp[i][j]=Math.min(right,down)+grid[i][j];
        }

    
}
