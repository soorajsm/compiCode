
class Solution {
    public boolean isCircularSentence(String s) {
        if(s.charAt(0)!=s.charAt(s.length()-1))
            return false;
        int index=s.indexOf(" ");
        if(index==-1)
            return true;
        while(index!=-1)
        {
            if(s.charAt(index-1)!=s.charAt(index+1))
                return false;
            index=s.indexOf(" ",index+1);
        }
        return true;
    }
}


















// class Solution {
//     public boolean isCircularSentence(String sentence) {
//         String sen[]=sentence.split(" ");
//         int arrlen=sen.length;
//         if(sen[0].charAt(0)==sen[sen.length-1].charAt(sen[sen.length-1].length()-1))
//             {
//                 if(arrlen==1)
//                     return true;
//                 int j=1,i=0;
//                 while(j<arrlen)
//                 {
//                     char curr=sen[i].charAt(sen[i].length()-1);
//                     char next=sen[j].charAt(0);
//                     if(curr==next)
//                     {
//                         i++;
//                         j++;    
//                     }
//                     else return false;
//                 }
//             }
//             else return false;

//         return true;
//     }
// }