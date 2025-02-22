class Solution {
    private int n;
    public String findDifferentBinaryString(String[] nums) {
        n=nums[0].length();
        Set<String>set=new HashSet<>();
        for(String s:nums)
            set.add(s);
        return backtrack(set,new StringBuilder());
    }

    public String backtrack(Set<String>set,StringBuilder sb)
    {
        if(sb.length()==n)
        {
            if(set.contains(sb.toString()))
                return "";
            return sb.toString();
        }
        for(char c: new char[]{'0','1'} )
        {
            sb.append(c);
            if(!backtrack(set,sb).isEmpty())   
                return sb.toString();
            sb.deleteCharAt(sb.length()-1);
        }
        return "";
    } 
}