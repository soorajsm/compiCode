class Solution {
    public int countGoodSubstrings(String s) {
        if (s == null || s.length() < 3)
            return 0;
        int end=0,count=0;
        StringBuilder sb=new StringBuilder();
        for(int start=0;start<s.length();start++)
        {
            sb.append(s.charAt(start));
            if((start-end+1)>=3)
            {
                if(isGoodStr(sb.toString()))
                    count++;

                sb.deleteCharAt(0);
                end++;
            }
        }
        return count;
    }

    public boolean isGoodStr(String s)
    {
        if(s.charAt(0)!=s.charAt(1) && s.charAt(0)!=s.charAt(2) && s.charAt(1)!=s.charAt(2))
            return true;
        return false;
    }
}