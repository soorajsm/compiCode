class Solution {
    public List<List<Integer>> combinationSum2(int[] a, int tar) {
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(a);
        backtrack(a,0,tar,res,new ArrayList<>());
        return res;
    }
    public void backtrack(int a[],int startIndex,int tar,List<List<Integer>>res,List<Integer>list)
    {
        if(tar==0)
        {
            res.add(new ArrayList(list));
            return;
        }

        if(startIndex==a.length )
            return;

        for(int j=startIndex;j<a.length;j++)
        {
            if(j>startIndex && a[j]==a[j-1])
                continue;

            if(a[startIndex]>tar)
                return;

            list.add(a[j]);
            backtrack(a,j+1,tar-a[j],res,list);
            list.remove(list.size()-1);
        }
    }
}
