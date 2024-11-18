class Solution {
    public int singleNonDuplicate(int[] nums) {
        int j=0,i=0;
        for(i=0;i<nums.length-1;i+=2)
        {
            j=i+1;
            if(nums[i]!=nums[j])
                return nums[i];
        }
        return nums[i];
    }
}