import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        LongestCommonSubsequence l=new LongestCommonSubsequence();
        String s1="abcdaf";
        String s2="acbcf";
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i], -1);
        }
        int res=l.solve(s1,s2,dp,s1.length(),s2.length());
        System.out.println("Result is:"+res);
    }
    public int solve(String s,String t,int[][] dp,int i,int j){
      
        if(i==0||j==0){
            return 0;
        }
       
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
      
        if(s.charAt(i-1)==t.charAt(j-1)){
            return dp[i][j]=1+solve(s,t,dp,i-1,j-1);
        }
       
        return dp[i][j]=Math.max(solve(s,t,dp,i-1,j),solve(s,t,dp,i,j-1));

    }
}
