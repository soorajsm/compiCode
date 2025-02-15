class Solution {
    public int climbStairs(int n) {
        int count=0;
        return helper(n);
    }
    public int helper(int n)
    {
        if(n<=1)
            return n;
        int sec=1;
        int first=1;
        for(int i=2;i<=n;i++)
        {
            int temp=sec;
            sec=first;
            first=temp+first;
        }
        return first;
    }
}