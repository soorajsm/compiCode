class Solution {
    public List<List<Integer>> permuteUnique(int[] a) {
        Arrays.sort(a);
        boolean set[]=new boolean[a.length];
        List<List<Integer>>res=new ArrayList<>();
        int n=a.length;
        backtrack(a,set,new ArrayList<>(),res,n);
        return res;
    }
    public void backtrack(int a[],boolean set[],List<Integer>list,List<List<Integer>>res,int n)
    {
        if(list.size()==a.length)
        {
            res.add(new ArrayList(list));
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(i>0 && a[i]==a[i-1] && !set[i-1]) continue;

            if(!set[i])
            {
                list.add(a[i]);
                set[i]=true;

                backtrack(a,set,list,res,n);

                list.remove(list.size()-1);
                set[i]=false;
            }
        }
    }
}