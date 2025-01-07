import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TriangeSum {
    public static void main(String[] args) {
        List<Integer> w = new ArrayList<Integer>();
        List<Integer> ww = new ArrayList<Integer>();
  List<List<Integer>> a = new ArrayList<List<Integer>>();
  //for(int i=1;i<3;i++){
      w.add(11);
      w.add(-10);
    //   w.add(2);
    //   w.add(3);
    //   w.add(6);
    //   w.add(5);
    //   a.add(w);
    //   w.add(7);
    //   w.add(4);
    //   w.add(1);
    //   w.add(8);
    //   w.add(3);
    //   //w.add(3);
       a.add(w);
       
  //}
  int res=solve(a);
  System.out.println("Result is :"+res);
        
    }
     static int solve(List<List<Integer>>  input){
     int n=input.size();
     int dp[][]=new int[n][n];
     for(int i=0;i<dp.length;i++){
          Arrays.fill(dp[i],-1);
     }
     int res=recTrianglePath(0,0,n,input,dp);

     return res;   
    }
    static int recTrianglePath(int i,int j,int n,List<List<Integer>> triangle,int[][] dp){
        //if(triangle.get(i).get(j)<0) return Math.min(triangle.get(i).get(j),triangle.get(i+1).get(j+1));
        System.out.println("");
        if(i>=n||j>=n) return Integer.MAX_VALUE;
   
           if(i==n-1) return triangle.get(i).get(j);
   
           if(dp[i][j]!=-1) return dp[i][j];
   
           int down = triangle.get(i).get(j)+ recTrianglePath(i+1,j,n,triangle,dp);
           int diagonal = triangle.get(i).get(j)+ recTrianglePath(i+1,j+1,n,triangle,dp);
   
           return dp[i][j] = Math.min(down,diagonal);
       }
    
}
