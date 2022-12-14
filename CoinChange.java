class SolutionCoinChange {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length + 1][amount+1];
        int len=dp.length;
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < dp[0].length; j++) {
                if(j == 0) {
                    dp[i][j] = 0;
                }
                else if(i == 0) {
                    dp[i][j] = (int)1e5; 
                }
                else if(coins[i-1] > j) {
                    dp[i][j] = dp[i-1][j];
                }
                else {
                    dp[i][j] = minn(1+dp[i][j-coins[i-1]], dp[i-1][j]);
                }
            }
        }
        return dp[coins.length][amount] > (int)1e4 ? -1:dp[coins.length][amount];
    }
    
    public int minn (int i, int j){
        int res=Math.min(i,j);
        return res;
    }
        
}
