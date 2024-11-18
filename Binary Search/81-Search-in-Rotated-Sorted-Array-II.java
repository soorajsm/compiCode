class Solution {
    public boolean search(int[] a, int target) {
    int low=0,high=a.length-1;
       while(low<=high)
       {
            int mid=low+(high-low)/2;
            if(a[mid]==target)
                return true;

            else if(a[low]==a[mid] && a[mid]==a[high])
            {
                low+=1;
                high-=1;
                continue;

            }

            else if(a[low]<=a[mid])
            {
                if(a[low]<=target && target<=a[mid])
                    high=mid;
                else
                    low=mid+1;
            }
            else
            {
                if(a[mid]<=target && target<=a[high])
                    low=mid;
                else
                    high=mid-1;
            }
       }
       return false;
    }
}
