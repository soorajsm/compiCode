class Solution {
    public int maxScore(String s) {
        int count[]=new int[2];
        for(char c:s.toCharArray())
        {
            if(c=='1')
                count[1]++;
        }
        int i=0,j=s.length()-1,max=0;
        while(i<j)
        {
            if(s.charAt(i)=='0')
                count[0]++;
            else
                count[1]--;
            max=Math.max(max,count[0]+count[1]);
            i++;
        }
         return max;  
    }
}