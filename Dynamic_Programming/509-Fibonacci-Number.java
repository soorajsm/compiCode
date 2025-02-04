class Solution {
    public int fib(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
    public int helper(int n,int dp[])
    {
        if(n<=1)
            return n;
        if(dp[n]!=-1)
            return dp[n];
        dp[n]=helper(n-1,dp)+helper(n-2,dp);
        return dp[n];
    }
}









// class Solution {
//     public int fib(int i) {
//     if(i<=1)
//         return i;
//     int a=0,b=1;
//     for(int j=2;j<=i;j++)
//     {
//         int temp=b;
//         b=b+a;
//         a=temp;
//     }
//     return b;
//     }
// }