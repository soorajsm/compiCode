class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n=chalk.length,i=0;
        if(n==1)
            return 0;
        long sum=0;

        for(int j:chalk)
            sum+=j;
        
        k=(int)(k%sum);

        for(i=0;i<n;i++)
        {
            if(k<chalk[i])
                return i;
            k-=chalk[i];
        }
        return 0;
    }
}