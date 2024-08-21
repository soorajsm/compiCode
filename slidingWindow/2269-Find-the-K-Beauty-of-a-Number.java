class Solution {
    public int divisorSubstrings(int num, int k) {
        int win=1;
        for(int i=0;i<k;i++)
            win*=10;
        int ele=0;
        int temp=num;
        int count=0;
        while(temp>=(win/10))
        {
            ele=temp%win;
            if(ele!=0 && num%ele==0)
                count++;
            temp/=10;
        }
        return count;
    }
}