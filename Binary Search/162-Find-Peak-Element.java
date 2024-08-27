class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length-1;

        if(n==0 || nums[0]>nums[1])
            return 0;
        if(nums[n]>nums[n-1])
            return n;
        int left=1,right=n-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1])
                return mid;
            else if(nums[mid-1]>nums[mid])
                right=mid-1;
            else 
                left=mid+1;

        }
        return 1;
    }

}