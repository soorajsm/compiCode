class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int a=0,b=0;
        int n=derived.length;
        if(n==1)
        {
            if(derived[0]==1)
                return false;    
            return true;
        }
        if(derived[0]==1)
        {
            a=0;
            b=1;
        }
        else
        {
            a=0;
            b=0;
        }
        int first=a;
        for(int i=1;i<n;i++)
        {
            if(i!=n-1)
            {
                a=b;
                b=a^derived[i];
            }
            else
            {
                if((first^b)!=derived[n-1])
                    return false;
            }
        }
        return true;
    }
}