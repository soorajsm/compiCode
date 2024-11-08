class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int sum=0,res=0;
        int freq[]=new int[14];
        for(String s:garbage)
        {
            sum+=s.length();
        }
        String allgar[]={"M","P","G"};
        res+=sum;
        for(String s:allgar)
        {
            int temp=0;
            for(int i=1;i<garbage.length;i++)
            {
                if(garbage[i].contains(s))
                {
                    res+=travel[i-1]+temp;
                    temp=0; 
                }
                else
                    temp+=travel[i-1];
            }
        }
        return res;
    }

}