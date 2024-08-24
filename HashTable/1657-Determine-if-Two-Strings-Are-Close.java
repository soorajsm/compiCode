class Solution {
    public boolean closeStrings(String w1, String w2) {
        if(w1.length()!=w2.length())
            return false;

        Map<Character,Integer>map1=new HashMap<>();  
        Map<Character,Integer>map2=new HashMap<>();   
        Set<Character>set=new HashSet<>(); 
        for(char i:w1.toCharArray()){
            map1.put(i,map1.getOrDefault(i,0)+1);
            set.add(i);
        }
        
        for(char i:w2.toCharArray())
        {
            map2.put(i,map2.getOrDefault(i,0)+1);
            set.remove(i);
        }
        if(!set.isEmpty())
            return false;

        List<Integer>list=new ArrayList<>();
        for(int i:map1.values())
            list.add(i);

        for(int i:map2.values())
            list.remove(Integer.valueOf(i));

        if(list.isEmpty())
            return true;
        
        return false;
    }
}