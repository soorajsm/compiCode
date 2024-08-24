class Solution {
    public boolean closeStrings(String w1, String w2) {
        if(w1.length()!=w2.length())
            return false;

        int freq1[]=new int[26];
        int freq2[]=new int[26];
        boolean seen[]=new boolean[26];
        for(char i:w1.toCharArray()){
            freq1[i-97]++;
            seen[i-97]=true;
        }
        
        for(char i:w2.toCharArray())
        {
            if(!seen[i-97])
                return false;
            freq2[i-97]++;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for(int i=25;i>=0;i--)
        {
            if(freq1[i]!=freq2[i])
                return false;
            if(freq1[i]==0)
                return true;
        }

        return true;
    }
}