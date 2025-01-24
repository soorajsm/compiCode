class Solution {
    public int subarraySum(int[] a, int k) {
        int count=0;
        int n=a.length;
        int sum=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            if(sum==k)
                count++;
            if(map.containsKey(sum-k))
                count+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}