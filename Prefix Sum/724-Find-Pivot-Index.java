class Solution {
    public int pivotIndex(int[] a) {
        int rsum=0;
        int n=a.length;
        int psum[]=new int[n+1];
        for(int i=1;i<=n;i++)
            psum[i]=psum[i-1]+a[i-1];
        rsum=psum[n];
        for(int i=0;i<n;i++)
        {
            rsum-=a[i];
            if(rsum==psum[i])
                return i;
        }
        return -1;
    }
}