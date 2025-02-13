class Solution {
    public int maximumSum(int[] a) {
        Map<Integer,Integer>map=new HashMap<>();
        int b[]=new int[a.length];
        int max=0;
        for(int i=a.length-1;i>=0;i--)
        {
            int key=findsum(i,a,b);
            if(map.containsKey(key))
            {
                int val=map.get(key);
                max=Math.max(a[i]+val,max);
                if(a[i]>val)
                    map.put(key,a[i]);
            }
            else
                map.put(key,a[i]);
        }
        return (max==0)?-1:max;
    }
    public int findsum(int i,int a[],int b[])
    {
        if(b[i]!=0)
            return b[i];
        int res=0;
        int num=a[i];
        while(num>0)
        {
            res+=num%10;
            num/=10;
        }
        b[i]=res;
        return res;
    }
}