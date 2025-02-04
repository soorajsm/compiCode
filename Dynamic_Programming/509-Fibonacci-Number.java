class Solution {
    public int fib(int i) {
    if(i<=1)
        return i;
    int prev2=0,prev1=1;
    for(int j=2;j<=i;j++)
    {
            int curr = prev1+prev2;
            prev2=prev1;
            prev1=curr;
    }
    return prev1;
    }
}









// // Using Dynamic programming;

// class Solution {
//     public int fib(int n) {
//         int dp[]=new int[n+1];
//         Arrays.fill(dp,-1);
//         return helper(n,dp);
//     }
//     public int helper(int n,int dp[])
//     {
//         if(n<=1)
//             return n;
//         if(dp[n]!=-1)
//             return dp[n];
//         dp[n]=helper(n-1,dp)+helper(n-2,dp);
//         return dp[n];
//     }
// }









