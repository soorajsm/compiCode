class Solution {
    public int longestSubarray(int[] a) {
        int end=0;
        int zcount=0,ocount=0;
        int max=Integer.MIN_VALUE;
        for(int start=0;start<a.length;start++)
        {
            if(a[start]==0)
                zcount++;
            else
                ocount++;
            while(zcount>1)
            {
                if(a[end]==0)
                    zcount--;
                end++;
            }
            max=Math.max(max,start-end);
        }

        return max;
    }
}