class Solution {
    public int minimizeXor(int n1, int n2) {
        if(Integer.bitCount(n1)==Integer.bitCount(n2))
            return n1;
        int res=n1;
        if(Integer.bitCount(n1)>Integer.bitCount(n2))
        {
            while(Integer.bitCount(res)>Integer.bitCount(n2))
                res&=(res-1);
        }
        else
        {
            while(Integer.bitCount(res)<Integer.bitCount(n2))
                res|=(res+1);
        }
        return res;
    }
}