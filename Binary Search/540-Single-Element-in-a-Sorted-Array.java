class Solution {
    public int singleNonDuplicate(int[] a) {
        int low=0,high=a.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(low==high)
                return a[mid];
            
            if((mid & 1) == 0)
            {
                if(a[mid]==a[mid+1])
                    low=mid+2;
                else
                    high=mid;
            }
            else
            {
                if(a[mid]==a[mid+1])
                    high=mid-1;
                else
                    low=mid+1;
            }
        }
        return -1;
    }
}






        // Using two pointer

        // int j=0,i=0;
        // for(i=0;i<nums.length-1;i+=2)
        // {
        //     j=i+1;
        //     if(nums[i]!=nums[j])
        //         return nums[i];
        // }
        // return nums[i]; 