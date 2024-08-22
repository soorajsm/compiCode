class Solution {
    public int longestOnes(int[] nums, int k) {
        int end=0;
        int zcount=0;
        int max=Integer.MIN_VALUE;
        for(int start=0;start<nums.length;start++)
        {
            if(nums[start]==0)
                zcount++;
            while(zcount>k)
            {
                if(nums[end]==0)
                    zcount--;
                end++;
            }
            max=Math.max(max,start-end+1);
        }
        return max;
    }
}