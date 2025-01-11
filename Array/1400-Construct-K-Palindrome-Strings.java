class Solution {
    public boolean canConstruct(String s, int k) {
        if(k==s.length())   return true;
        if(k>s.length())    return false;
        int freq[]=new int[26];
        int odd=0;
        for(char c:s.toCharArray())
            freq[c-'a']++;
        for(int i:freq)
        {
            if((i&1)==1)
                odd++;
        }                                                                                                                                    
        if(k>=odd)
            return true;
        return false;
    }
}