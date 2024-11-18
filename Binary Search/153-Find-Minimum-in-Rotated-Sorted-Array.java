class Solution {
    public int findMin(int[] a) {
        int low=0,high=a.length-1;
        int mid=0;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(high==mid)
                return a[mid];
            else if(a[mid]>a[high])
                low=mid+1;
            else
                high=mid;
        }
        return mid;
    }
}



















































        // int n=a.length-1;
        // int left=0,right=n;
        // if(n==0)
        //     return a[0];

        // while(left<=right)
        // {
        //     int mid=left+(right-left)/2;
        //     if(right==mid && mid==left)
        //         return a[mid];

        //     else if(a[mid]<a[right])

        //         right=mid;
        //     else
        //         left=mid+1;
        // }
        // return 0;