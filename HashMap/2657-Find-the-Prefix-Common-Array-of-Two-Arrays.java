class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int count=0;
        int freq[]=new int[51];
        int res[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            freq[a[i]]++;
            freq[b[i]]++;
            if(a[i]==b[i])
                count++;
            else
            {
                if(freq[a[i]]>=2)
                    count++;
                if(freq[b[i]]>=2)
                    count++;
            }
            res[i]=count;
        }
        return res;
    }
}