class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>list;
        for(int i=0;i<(1<<n);i++)      //(1<<n) is same as pow(2,n)
        {
            list=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))!=0)
                    list.add(nums[j]);
            }
            res.add(list);
        }
        return res;
    }
}