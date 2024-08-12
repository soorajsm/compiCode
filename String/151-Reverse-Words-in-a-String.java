class Solution {
    public String reverseWords(String s) {
      StringBuilder sb=new StringBuilder();
      String a[]=s.split(\\\\\s+\);
      for(int i=a.length-1;i>=0;i--)
      {
        sb.append(a[i]).append(\ \);
      }
      return sb.toString().trim();










































        // String sa[]=s.split(\\\\\s+\);
        // StringBuilder sb=new StringBuilder();
        // for(int i=sa.length-1;i>=0;i--)
        //     sb.append(sa[i]).append(\ \);
        
        
        // return sb.toString().trim();
    }
}