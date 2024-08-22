class Solution {
    public int findComplement(int num) {
        
        // simple and efficient approach 0ms

        int mask=0;
        int temp=num;
        while(temp>0)
        {
            mask=(mask<<1) | 1;
            temp>>=1;
        }
        return num^mask;




        // 2nd approach using StringBuilder();   1ms


        // StringBuilder sb=new StringBuilder();
        // while(num>0)
        // {
        //    int i=num%2;
        //     if(i==0)
        //         sb.insert(0,1);
        //     else
        //         sb.insert(0,0);
        //     num/=2;
        // }
        // num=Integer.parseInt(sb.toString(),2);
       
        // return num;
    }
}
