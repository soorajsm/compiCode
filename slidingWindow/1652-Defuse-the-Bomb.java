class Solution {
    public int[] decrypt(int[] code, int k) {
        int a[]=new int[code.length];
        if(k==0)
            return a;
            
        int n=code.length;
        int start=1,end=k,sum=0;

        if(k<0){
            k=-k;
            start=n-k;
            end=n-1;
        }
        for(int i=start;i<=end;i++)
            sum+=code[i];

        for(int i=0;i<n;i++)
        {
            a[i]=sum;
            end=(end+1)%n;
            sum=sum-code[start]+code[end];
            start=(start+1)%n;
        }

        return a;
    }
}