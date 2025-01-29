class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>res=new ArrayList<>();
        backtrack(1,k,n,new ArrayList<>(),res);
        return res;
    }
    public void backtrack(int num,int k,int n,List<Integer> list, List<List<Integer>>res)
    {
        if(k==0)
        {
            res.add(new ArrayList(list));
            return;
        }
        if(num>n)
            return;

        list.add(num);
        backtrack(num+1,k-1,n,list,res);
        list.remove(list.size()-1);
        backtrack(num+1,k,n,list,res);

    }
}