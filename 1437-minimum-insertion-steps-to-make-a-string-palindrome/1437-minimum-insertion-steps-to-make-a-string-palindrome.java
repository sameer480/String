class Solution {
    public int min1(String s, int i, int j, int[][] dp) {
        if (i >= j) {
            return 0; // Base case: already a palindrome or single char
        }
        if (dp[i][j] != -1) {
            return dp[i][j]; // Return previously computed result
        }

        if (s.charAt(i) == s.charAt(j)) {
            dp[i][j] = min1(s, i + 1, j - 1, dp); // No insertion needed
        } else {
            int p1 = min1(s, i + 1, j, dp);   // Skip i
            int p2 = min1(s, i, j - 1, dp);   // Skip j
            dp[i][j] = Math.min(p1, p2) + 1;  // Take min insertions + 1 for current mismatch
        }

        return dp[i][j];
    }

    public int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        // Initialize with -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return min1(s, 0, n - 1, dp);
    }
}
