class Solution {
    private int count=0;
    public String getHappyString(int n, int k) {
        if(k>(3*Math.pow(2,n-1)))
            return "";
        char a[]={'a','b','c'};
        count=k;
        return backtrack(a,n,new StringBuilder());
    }

    public String backtrack(char a[],int n,StringBuilder sb)
    {
        if(sb.length()==n) 
        {
            count--;
            if(count==0)
                return sb.toString();
            return "";
        }

        for(int i=0;i<3;i++)
        {
            int len=sb.length()-1;
            if(len>=0)
            {
                if(sb.charAt(len)==a[i])
                    continue;
            }
            sb.append(a[i]);
            String res=backtrack(a,n,sb);
            if(!res.equals(""))
                return res;
            sb.deleteCharAt(len+1);
        }
        return "";
    }
}