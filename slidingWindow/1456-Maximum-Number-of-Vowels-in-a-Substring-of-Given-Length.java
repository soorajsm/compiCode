class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
            if(isVowel(s.charAt(i)))
                count++;
        max=Math.max(max,count);
        int end=0;

        for(int start=k;start<s.length();start++)
        {
            if(isVowel(s.charAt(start)))
                count++;
            if(isVowel(s.charAt(end)))
                count--;
            max=Math.max(max,count);
            end++;
        }
    return max;
    }

    public boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return true;
        return false;
    }
}