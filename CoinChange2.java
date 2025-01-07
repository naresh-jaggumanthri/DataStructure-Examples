public class CoinChange2 {
    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amount=5;
        int res=change(amount,coins);
        System.out.println("the number of ways is :"+res);
    }
    public static int change(int amount, int[] coins) {
        int n=coins.length;
        int[] dp=new int[amount+1];
          dp[0]=1;
        for(int i=0;i<n;i++){
            for(int j=coins[i];j<=amount;j++){

                dp[j]+=dp[j-coins[i]];
            }
        }
        return dp[amount];

    }
}
