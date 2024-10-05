class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        int first[]=new int[26],second[]=new int[26];
        for(char c: s1.toCharArray())
            first[c-'a']++;
        
        int window=s1.length();
        int end=0,start=0;

        for(start=0;start<window;start++)
            second[s2.charAt(start)-'a']++;

        if(Arrays.equals(first,second))  return true;

        for(;start<s2.length();start++)
        {
            second[s2.charAt(start)-'a']++;
            second[s2.charAt(start-window)-'a']--;
            if(Arrays.equals(first,second))  return true;
        }

        return false;
    }
}