class Solution {
    public boolean canMakeSubsequence(String s1, String s2) {
        int i=0,j=0;
        int len1=s1.length(),len2=s2.length();
        if(len1<len2)
            return false;
        while(i<len1 && j<len2)
        {
            if(s1.charAt(i)==s2.charAt(j) || (s1.charAt(i)-'a'+1)%26 == s2.charAt(j)-'a')
            {
                i++; j++;
            }
            else
                i++;
        }
        if(j==len2)
            return true;
        
        return false;
    }
}