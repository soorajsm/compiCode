class Solution {
    public int[] searchRange(int[] a, int target) {
        int n=a.length-1;
        int low=0,high=n,i=0;
        int ans[]={-1,-1};
        if(n<0)
            return ans;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]==target)
            {
                ans[0]=mid;
                high=mid-1;
            }
            else if(a[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }

        low=0;high=n;
            
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]==target)
            {
                ans[1]=mid;
                low=mid+1;
            }
            else if(a[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        

        return ans;
    }
}