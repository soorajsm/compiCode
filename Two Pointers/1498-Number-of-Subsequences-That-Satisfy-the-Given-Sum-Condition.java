class Solution {
    public int numSubseq(int[] a, int target) {
        Arrays.sort(a);
        int n=a.length;
        int count=0;
        int mod=1000000007;
        int pow[]=new int[n];
        pow[0]=1;
        for(int i=1;i<n;i++)
            pow[i]=(pow[i-1]*2)%mod;
        int i=0,j=n-1;
        while(i<=j)
        {
            if(a[i]+a[j]<=target)
            {
                count=(count+pow[j-i])%mod;
                i++;
            }
            else
                j--;
        }
        return count;
    }
}