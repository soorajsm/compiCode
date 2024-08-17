class Solution {
    public double findMaxAverage(int[] a, int k) {
        int end=0;
        double sum=0;
        double result=-999999;
        for(int start=0;start<a.length;start++)
        {
            sum+=a[start];
            if((start-end+1)>=k)
            {
                result=Math.max(result,sum/k);
                sum-=a[end];
                end++;
            }
            
        }                                       
        return result;
    }
}