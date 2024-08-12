class Solution {
    public String reverseVowels(String s) {
        char str[]= s.toCharArray();
        Set<Character>set=new HashSet<>(Set.of('a','e','i','o','u','A','E','I','O','U'));
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(!set.contains(str[i]))
                i++;
            if(!set.contains(str[j]))
                j--;
            if(set.contains(str[i]) && set.contains(str[j]))
                {
                    char temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                    i++;
                    j--;
                }
        }
        s=new String(str);
        return s;
    }
}