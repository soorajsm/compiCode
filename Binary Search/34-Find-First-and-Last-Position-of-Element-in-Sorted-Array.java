class Solution {
    public int[] searchRange(int[] a, int target) {
        int n=a.length-1;
        int l=0,r=n,i=0;
        int res[]={-1,-1};
        if(n<0)
            return res;
        
        if(n==0)
          {  
            if(a[0]==target)
            {
                res[0]=0;
                res[1]=0;
            }
            return res;
        }
    
        while(l<r)
        {
            int mid=l+(r-l)/2;
            if(a[mid]<target)
                l=mid+1;
            else
                r=mid;
        }

        

        if(a[l]==target)
            res[i++]=l;

        l=0;r=n;

            
        while(l<r)
        {
            int mid=l+(r-l+1)/2;

            if(a[mid]>target)
                r=mid-1;
            else
                l=mid;
        }
        


        if(a[l]==target)
            res[i++]=l;


        return res;
    }
}