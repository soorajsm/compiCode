class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0,n=words.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(isPrefixAndSuffix(words[i],words[j]))
                    count++;
            }
        }
        return count;
    }
    public boolean isPrefixAndSuffix(String a,String b)
    {
        if(b.startsWith(a) && b.endsWith(a))
            return true;
        return false;
    }
}