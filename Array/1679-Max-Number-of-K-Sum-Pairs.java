class Solution {
    public int maxOperations(int[] a, int k) {
        Arrays.sort(a);
        int count=0;
        int sum=0;
        int i=0,j=a.length-1;
        while(i<j)
        {
            sum=a[i]+a[j];
            if(sum==k)
            {
                count++;
                i++;
                j--;
            }
            else if(sum>k)
                j--;
            else
                i++;
        }
        return count;
    }
}