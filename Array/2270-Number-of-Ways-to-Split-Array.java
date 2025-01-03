class Solution {
    public int waysToSplitArray(int[] nums) {
        long rsum=0,lsum=0;
        int count=0;
        for(int i:nums)
            rsum+=i;
        for(int i=0;i<nums.length-1;i++)
        {
            lsum+=nums[i];
            rsum-=nums[i];
            if(lsum>=rsum)
                count++;
        }
        return count;
    }
}