class Solution {
    public int longestMonotonicSubarray(int[] a) {
        int max=1;
        int i=0,j=i+1;
        int n=a.length;
        if(n==1)
            return 1;
        while(i<n && j<n)
        {
            while(j<n && a[j]>a[j-1])
            {
                max=Math.max(max,j-i+1);
                j++;
            }
            if(j<n)
            {
                i=j;
                j=i+1;
            }
            else
                break;

        }
        i=0; j=i+1;
        while(i<n && j<n)
        {
            while(j<n && a[j]<a[j-1])
            {
                max=Math.max(max,j-i+1);
                j++;
            }
            if(j<n)
            {
                i=j;
                j=i+1;
            }
            else
                break;

        }
        return max;
    }
}