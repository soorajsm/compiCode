class Solution {
    public String fractionAddition(String expression) {
        String fra[]=expression.split("(?=[+-])");
        long nu1=0,den1=1;
        for(String s:fra)
        {
            String num[]=s.split("/");
            long nu2=Long.parseLong(num[0]);
            long den2=Long.parseLong(num[1]);
            nu1=(nu1*den2)+(nu2*den1);
            den1=den1*den2;
        }
        if(nu1==0)
            return "0/1";
        long gcd=gcd(Math.abs(nu1),Math.abs(den1));
        nu1=nu1/gcd;
        den1=den1/gcd;

        return nu1+"/"+den1;
    }

    public long gcd(long a,long b)
    {
        if(a==b)
            return a;
        else if(a>b)
            return gcd(a-b,b);
        else
            return gcd(a,b-a);
    }
}