class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String result=" ";
       if(!(str1+str2).equals(str2+str1))
            return "";
        else
            {
                result=str2.substring(0,gcd(str1.length(),str2.length()));
                return result;
            } 
    }

    public int gcd(int a,int b)
    {
        int min=Math.min(a,b);
        for(int i=min;i>=2;i--)
        {
            if(a%i==0 && b%i==0)
                return i;
        }
        return 1;
    }
}