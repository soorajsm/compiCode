class Solution {
    public int mySqrt(int x) {

        //using binery search
        if(x<2)
            return x;
         int l=0,h=x;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(x/m==m)
                return m;
            else if(x/m<m)
                h=m-1;
            else
                l=m+1;

        }

        return h;
    }
}

    //    Simple code but time complexity is more

    //     if(x==0)
    //         return 0;
    //     long i=1;
    //     while(i*(i+2)<x)
    //     {
    //         i++;
    //     }
    //     return (int)i;
    // }
