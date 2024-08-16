class Solution {
    public int compress(char[] chars) {
        int ind=0;
        for(int i=0;i<chars.length;)
        {
           char curr=chars[i];
           int count=0;
           while(i<chars.length && curr==chars[i])
           {
                count++;
                i++;
           }
           chars[ind++]=curr;
           if(count>1)
           {
            for(char c:(Integer.toString(count)).toCharArray())
            {
                chars[ind++]=c;
            }
           }
            
        }
    
        return ind;


    }
}


























//  for(int i=0;i<chars.length;i++)
//         {
//             if(chars[i]==temp)
//             {
//                 count++;
//             }
//             else
//             {
//                 s=(count==1) ? "" : count+"";
//                 sb.append(s);
//                 count=1;
//                 sb.append(chars[i]);
//                 temp=chars[i];
//             }

//             if(i==chars.length-1)
//                 sb.append((count==1) ? "" : count+"");
            
//         }
//         for(int i=0;i<sb.length();i++)
//         {
//             chars[i]=sb.charAt(i);
//         }

//         return sb.length();


//     }
// }