class Solution {
    public int largestCombination(int[] candidates) {
        int freq[]=new int[24];
        for(int ele:candidates)
        {
            int i=23;
            while(ele>0)
            {
                if((ele&1)==1)
                    freq[i]++;
                i--;
                ele>>=1;
            }
        }
        Arrays.sort(freq);
        return freq[freq.length-1];
    }
}