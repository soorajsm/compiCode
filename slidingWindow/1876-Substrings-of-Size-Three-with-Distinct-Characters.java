class Solution {
    public int countGoodSubstrings(String s) {
        if (s == null || s.length() < 3)
            return 0;
        int end=0,count=0;
        for(int start=0;start<s.length()-2;start++)
        {
           if(isGoodStr(s,start))
                count++;
        }
        return count;
    }

    public boolean isGoodStr(String s,int i)
    {
        if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)!=s.charAt(i+2) && s.charAt(i+1)!=s.charAt(i+2))
            return true;
        return false;
    }
}