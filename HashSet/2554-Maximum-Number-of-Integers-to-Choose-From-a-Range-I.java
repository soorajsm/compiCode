class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer>set=new HashSet<>();
        for(int ele:banned)
            set.add(ele);

        int sum=0,count=0;
        for(int i=1;i<=n;i++)
        {
            if(!set.contains(i) && sum<=maxSum)
            {
                sum+=i;
                if(sum<=maxSum)
                    count++;
                else
                    return count;
            }
        }
        return count;
    }
}