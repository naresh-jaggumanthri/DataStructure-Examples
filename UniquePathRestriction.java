import java.util.*;
public class UniquePathRestriction {
    public static void main(String[] args) {
        
        int[][] input={{0,1},{0,0}};
        int m=input.length;
        int n=input[0].length;
        int result=0;
        result=calculateNumberOfPaths(m,n,input);

        System.out.println("Answer is :"+result);

        
    }
    public static int calculateNumberOfPaths(int i,int j,int[][] input){

        int[][] dp=new int[i+1][j+1];
        for(int k=0;k<dp.length;k++){
        Arrays.fill(dp[k],1);
        }

        
        return recNumberOfPaths(1,1,dp,i,j,input);


    }
    public static int recNumberOfPaths(int i,int j,int[][] dp,int m,int n,int[][] input){
      
       if(m==0&&n==0||input[i-1][j-1]==1){
        return 0;
       } 
    
    // if(i==m&&j==n){
    //     return dp[m][n];
    //  }
     
     if(dp[i][j]!=1) return dp[i][j];
     
    
     if(m>0&&n>0&&i<m&&j<n){
       
  
     int right=recNumberOfPaths(i,j+1,dp,m,n,input);
     int down=recNumberOfPaths(i+1,j,dp,m,n,input);
    
    
     dp[i][j]=right+down;
    
     }

     return dp[i][j];

     
   
    }
    
}
