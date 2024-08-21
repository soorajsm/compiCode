class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer>map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        int max=Integer.MIN_VALUE;
        int i=0,j=0;

        for(char c:s.toCharArray())
        {   
            map.put(c,map.getOrDefault(c,0)+1);
            
            while(map.getOrDefault(c,0)>2)
            {
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),1)-1);
                j++;
            }
            max=Math.max(max,i-j+1);
            i++;
        }
        return max;
    }
}