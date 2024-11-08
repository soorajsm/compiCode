class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int max=(int)Math.pow(2,maximumBit)-1;
        int len=nums.length;
        int res[]=new int[len];

        int r=max^nums[0];
        res[len-1]=r;
        int j=len-2;

        for(int i=1;i<len;i++)
        {
            r^=nums[i];
            res[j--]=r;
        }
        return res;
    }
}