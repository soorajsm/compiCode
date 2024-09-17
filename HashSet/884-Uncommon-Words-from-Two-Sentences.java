class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Set<String>set=new HashSet<>();
        Set<String>dup=new HashSet<>();
        for(String s:s1.split(" "))
        {
            if(!set.contains(s))
                set.add(s);
            else
                dup.add(s);
        }
        
        for(String s:s2.split(" "))
        {
            if(!set.contains(s))
                set.add(s);
            else
                dup.add(s);
        }
        set.removeAll(dup);
        return set.toArray(new String[0]);
    }
}