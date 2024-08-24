class Solution {
    public boolean closeStrings(String w1, String w2) {
        if(w1.length()!=w2.length())
            return false;

        int[] freq1=new int[26],freq2=new int [26] ;
        byte [] ch1=w1.getBytes(),ch2=w2.getBytes();

        for(byte i:ch1)
            freq1[i-'a']++;
        
        for(byte i:ch2)
        {
            if(freq1[i-'a']==0)
                return false;
            freq2[i-'a']++;
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