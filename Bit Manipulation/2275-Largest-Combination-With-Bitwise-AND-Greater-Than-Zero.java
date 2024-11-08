class Solution {
    public int largestCombination(int[] candidates) {
        int freq[]=new int[24];
        for(int i:candidates)
        {
            String bs=Integer.toBinaryString(i);
            int k=23,j=bs.length()-1;
            while(j>=0)
            {
                if(bs.charAt(j)=='1')
                    freq[k]++;
                k--;
                j--;
            }
        }
        Arrays.sort(freq);
        return freq[freq.length-1];
    }
}