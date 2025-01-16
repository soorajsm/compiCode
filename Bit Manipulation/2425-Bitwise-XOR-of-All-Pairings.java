class Solution {
    public int xorAllNums(int[] a, int[] b) {
      int ares=0,bres=0;
      int alen=a.length,blen=b.length;
      if(alen%2==1)
      {
        for(int i=0;i<blen;i++)
            bres^=b[i];
      }

      if(blen%2==1)
      {
        for(int i=0;i<alen;i++)
            ares^=a[i];
      }
       return bres^ares;
    }
}