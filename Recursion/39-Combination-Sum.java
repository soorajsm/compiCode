class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] a, int t) {
        Arrays.sort(a);
        List<Integer> list=new ArrayList<>();
        backtrack(a,t,0,list);
        return res;
    }

    public void backtrack(int a[],int t,int i, List<Integer>list)
    {   
        if(t==0)
        {
            res.add(new ArrayList(list));
            return;
        }
        if(i==a.length)
            return;
        if(a[i]>t)
            return;
        list.add(a[i]);
        backtrack(a,t-a[i],i,list);

        list.remove(Integer.valueOf(a[i]));
        backtrack(a,t,i+1,list);
    }
}