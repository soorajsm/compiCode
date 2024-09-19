class Solution {
    long ans=1;
    public List<Integer> getRow(int rowIndex) {
        List<Integer>list=new ArrayList<>();

        list.add(1);
        for(int i=1;i<=rowIndex;i++)
        {
            findfact(rowIndex,i);
            list.add((int)ans);
        }

        return list;
    }
    
    public void findfact(int n,int r)
    {
        ans*=(n-r+1);
        ans/=r;
    }
}