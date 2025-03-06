class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int val=n*n;
        boolean seen[]=new boolean[val+1];
        int sum=val*(val+1)/2;
        int res[]=new int[2];
        for(int a[]:grid)
        {
            for(int ele:a)
            {
                if(!seen[ele])
                {
                    sum-=ele;
                    seen[ele]=true;
                }
                else
                    res[0]=ele;

            }
        }
        res[1]=sum;
        return res;
    }
}