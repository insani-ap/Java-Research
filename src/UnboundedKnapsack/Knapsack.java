package UnboundedKnapsack;

class Knapsack {
    private static int max(int i, int j) {
        return Math.max(i, j);
    }

    public static int unboundedKnapsack(int Weight, int lengthArray, int[] profitArr, int[] weightArr) {
        int[] dp = new int[Weight + 1];

        for (int i = 0; i <= Weight; i++) {
            for (int j = 0; j < lengthArray; j++) {
                if (weightArr[j] <= i) {
                    dp[i] = max(dp[i], dp[i - weightArr[j]] + profitArr[j]);
                }
            }
        }

        return dp[Weight];
    }
}
