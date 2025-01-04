class Solution {
    public String stringHash(String s, int k) {
        StringBuilder res=new StringBuilder();
        int st=0,sum=0;
        for(int e=0;e<s.length();e++)
        {
            sum+=s.charAt(e)-'a';
            if((e-st+1)>=k)
            {
                sum%=26;
                res.append((char)(sum+'a'));
                sum=0;
                st=e+1;
            }
        }
        return res.toString();
    }
}