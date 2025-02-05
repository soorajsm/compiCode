class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count=0,first=-1,sec=-1;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                count++;
                if(first==-1)
                    first=i;
                else if(sec==-1)
                    sec=i;
                else return false;
            }
        }
        if(count==0)  return true;
        if(count==2 && s1.charAt(first)==s2.charAt(sec) && s1.charAt(sec)==s2.charAt(first))
            return true;
        else return false; 
    }
}







// class Solution {
//     public boolean areAlmostEqual(String s1, String s2) {
//         int i=0,j=0;
//         int irregular=0;
//         int freq[]=new int[26];
//         while(i<s1.length() && j<s2.length())
//         {
//             if(s1.charAt(i)!=s2.charAt(j))
//                 irregular++;
//             freq[s1.charAt(i)-'a']++;
//             freq[s2.charAt(i)-'a']--;
//             i++;
//             j++;
//         }
//         for(int ele:freq)
//         {
//             if(ele!=0)
//                 return false;
//         }
//         if(irregular<=2)
//             return true;
//         return false;
//     }
// }