class Solution {
    public String reverseStr(String s, int k) {
        int n=s.length();
        byte a[]=s.getBytes();
        for(int i=0;i<n-1;i+=(k*2))
        {
            int e=(i+k-1)>=n?n-1:(i+k-1);
            reverse(a,i,e);
        }
        return new String(a);
    }
    public void reverse(byte a[],int s,int e)
    {
        while(s<e)
        {
            byte temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++; e--;
        }
    }
}