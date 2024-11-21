class Solution {
    public int mySqrt(int x) {

        //using binery search
        if(x<2)
            return x;
        int ans=0;
        int low=1,high=x/2;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(x/mid>=mid)
            {
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return ans; 
    }
}

    //    Bruteforce

    //     if(x==0)
    //         return 0;
    //     long i=1;
    //     while(i*(i+2)<x)
    //     {
    //         i++;
    //     }
    //     return (int)i;
    // }
