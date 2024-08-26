class Solution {
    public char repeatedCharacter(String s) {
        boolean seen[]=new boolean[26];
        for(byte i:s.getBytes())
        {
            if(seen[i-'a'])
                return (char)i;
            else
                seen[i-'a']=true;
        }
        return 'h';
    }
}