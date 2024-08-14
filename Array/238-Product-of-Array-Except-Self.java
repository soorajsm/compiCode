
class Solution {
    public int[] productExceptSelf(int[] num) {
        int a[]=new int[num.length];
        int pre=1;
        for(int i=0;i<num.length;i++)
        {
            a[i]=pre;
            pre*=num[i];
        }
        int post=1;
        for(int i=num.length-1;i>=0;i--)
        {
            a[i]*=post;
            post*=num[i];
        }
        return a;
        
    }
}