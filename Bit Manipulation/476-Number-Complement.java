class Solution {
    public int findComplement(int num) {
        StringBuilder sb=new StringBuilder();
        while(num>0)
        {
           int i=num%2;
            if(i==0)
                sb.insert(0,1);
            else
                sb.insert(0,0);
            num/=2;
        }
        num=Integer.parseInt(sb.toString(),2);
       
        return num;
    }
}