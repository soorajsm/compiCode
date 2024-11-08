class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int res=0;
        String allgar[]={"M","P","G"};
        res+=garbage[0].length();
        for(String s:allgar)
        {
            int temp=0;
            for(int i=1;i<garbage.length;i++)
            {
                if(garbage[i].contains(s))
                {
                    res+=travel[i-1]+temp+countLetters(garbage[i],s);
                    temp=0; 
                }
                else
                    temp+=travel[i-1];
            }
        }
        return res;
    }

    public int countLetters(String word,String s)
    {
        int count=0;
        for(char str:word.toCharArray())
        {
            if(str==s.charAt(0))
                count++;
        }
        return count;
    }
}