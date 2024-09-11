class Solution {
    public int binaryGap(int N) {
           // Implement your solution here
        String s=Integer.toBinaryString(N);
        int max=0;
        int i=0;
        int len=s.length();
        while(s.charAt(i)!='1')
            i++;
        while(i<len-1)
        {
            int j=i+1;
            while(j<len-1 && s.charAt(j)!='1')
                j++;
            if(s.charAt(j)=='1')
                max=Math.max(max,(j-i));
            
            i=j;
        }
        
        return max;
    }
}

