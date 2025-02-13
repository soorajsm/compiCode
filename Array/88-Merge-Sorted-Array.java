class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int i=m-1,j=a.length-1;
        int k=n-1;
        while(i>=0 && k>=0)
        {
            if(a[i]<=b[k])
                a[j--]=b[k--];
            else
                a[j--]=a[i--];
        }
        while(k>=0)
        {
            a[j--]=b[k--];
        }
    }
}