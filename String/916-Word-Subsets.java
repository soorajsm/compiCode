class Solution {
    public List<String> wordSubsets(String[] w1, String[] w2) {
        List<String>list=new ArrayList<>();
        byte max[]=new byte[26];
        byte freq[];
        for(String s:w2)
        {
            freq=new byte[26];
            for(char c:s.toCharArray())
                freq[c-'a']++;
            boolean set[]=new boolean[26];
            for(char c:s.toCharArray())
            {
                if(set[c-'a']==false)
                {
                    max[c-'a']=(byte)Math.max(max[c-'a'],freq[c-'a']);
                    set[c-'a']=true;
                }
            }
        }

        for(String s:w1)
        {
            freq=new byte[26];
            int i=0;
            for(char c:s.toCharArray())
                freq[c-'a']++;
            for(i=0;i<26;i++)
            {
                if(freq[i]<max[i])
                    break;
            }
            if(i==26)
                list.add(s);
        }

        return list;
    }
}