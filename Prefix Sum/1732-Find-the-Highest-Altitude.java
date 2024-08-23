class Solution {
    public int largestAltitude(int[] a) {
        int max=0;
        int preSum[]=new int[a.length+1];
        for(int i=1;i<preSum.length;i++)
        {
            preSum[i]=preSum[i-1]+a[i-1];
            max=Math.max(max,preSum[i]);
        }
        return max;
    }
}