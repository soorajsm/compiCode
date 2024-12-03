class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder(s);
        int j=0;
        for(int i=0;i<sb.length();i++)
        {
            if(j>=spaces.length)
                break;
            if(i==spaces[j])
            {
                sb.insert(i+j," ");
                j++;
            }
        }
        return sb.toString();
    }
}