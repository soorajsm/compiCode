class Solution {
    public int minimumRecolors(String s, int k) {
        int min=Integer.MAX_VALUE;
        int count=0,start=0;
        for(int i=0;i<k;i++)
        {
            if(s.charAt(i)=='W')
                count++;
        }
        min=Math.min(min,count);
        for(int end=k;end<s.length();end++)
        {
            if(s.charAt(end)=='W')
                count++;
            if(s.charAt(start)=='W')
                count--;
            min=Math.min(min,count);
            start++;
        }
        return min;
    }
}