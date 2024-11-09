import java.util.*;
public class UniquePath {
    public static void main(String[] args) {
        int m=3;
        int n=7;

        int result=0;
        result=calculateNumberOfPaths(m,n);

        System.out.println("Answer is :"+result);

        
    }
    public static int calculateNumberOfPaths(int i,int j){

        int[][] dp=new int[i+1][j+1];
        for(int k=0;k<dp.length;k++){
        Arrays.fill(dp[k],1);
        }

        
        return recNumberOfPaths(1,1,dp,i,j);


    }
    public static int recNumberOfPaths(int i,int j,int[][] dp,int m,int n){
      
       if(m==0&&n==0){
        return 0;
       } 
    
    // if(i==m&&j==n){
    //     return dp[m][n];
    //  }
     
     if(dp[i][j]!=1) return dp[i][j];
     
    
     if(m>0&&n>0&&i<m&&j<n){
       
     int right=recNumberOfPaths(i,j+1,dp,m,n);
     int down=recNumberOfPaths(i+1,j,dp,m,n);
     //int right=1;
     //int down=2;
    
     dp[i][j]=right+down;
     }

     return dp[i][j];

     
   
    }
    
}
