class Solution {
    public int subsetXORSum(int[] a) {
        return fun(0,0,a.length,a);
    }
    public int fun(int i,int res,int n,int a[])
    {
        if(i==n)
        {
            return res;
        }
        int include=fun(i+1,res^a[i],n,a);
        int exclude=fun(i+1,res,n,a);
        return include+exclude;
    }
}