class Solution {
    public boolean isPalindrome(String s) {
        s=makeValidString(s);
        return isPal(s,0,s.length()-1);
    }

    public String makeValidString(String s)
    {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(c>='a' && c<='z' || c>='0' && c<='9')
                sb.append(c);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    // Using Recursion
    public boolean isPal(String s,int i,int j)
    {
        if(i>=j)    // base condition;
            return true;

        if(s.charAt(i)==s.charAt(j))
            return isPal(s,i+1,j-1);
        else    
            return false;
    }
    
}