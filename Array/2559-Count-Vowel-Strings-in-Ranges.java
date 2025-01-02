class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int res[]=new int[queries.length];
        int psum[]=new int[words.length];
        int sum=0;
        for(int i=0;i<words.length;i++)
        {
             if(words[i].matches("[aeiou]|^[aeiou].*[aeiou]$"))
             {
                psum[i]=sum+1;
                sum=psum[i];
             }
             else
                psum[i]=sum;
        }

        for(int i=0;i<queries.length;i++)
        {
            int s=queries[i][0],e=queries[i][1];
            res[i]=(s==0)?psum[e]:psum[e]-psum[s-1]; 
        }
        return res;
    }
}