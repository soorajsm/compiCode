class Solution {
    public int search(int[] a, int target) {
        int n=a.length-1;
        if(a[0]==target)
            return 0;
        if(a[n]==target)
            return n;

        int left=1,right=n-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(a[mid]==target)
                return mid;
            else if(a[mid]>=a[left])
            {
                if(a[left]<=target && target<a[mid])
                    right=mid-1;
                else
                    left=mid+1;
            }
            else
            {
                if(a[mid]<target && target<=a[right])
                    left=mid+1;
                else
                    right=mid-1;
            }
        }
        return -1;

    }
}