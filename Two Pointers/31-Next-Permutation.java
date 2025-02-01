class Solution {
    public void nextPermutation(int[] a) {
        int n=a.length;
        if(n==1)
            return;
        int first=n-2;
        while(first>=0 && a[first]>=a[first+1])
            first--;
        if(first>=0)
        {
            int last=n-1;
            while(a[last]<=a[first])
                last--;
            swap(a,first,last);
        }
        reverse(a,first+1,n-1);
    }
    public void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void reverse(int a[],int i,int j)
    {
        while(i<j)
        {
            swap(a,i,j);
            i++;
            j--;
        }
    }
}