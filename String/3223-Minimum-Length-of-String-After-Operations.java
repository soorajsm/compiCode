






class Solution {
    public int minimumLength(String s) {
        int freq[]=new int[26];
        int count=0;
        for(byte b:s.getBytes())
            freq[b-97]++;

        for(int i=0;i<26;i++)
        {
            if(freq[i]==0)
                continue;
            else if(freq[i]%2==0)
                count+=2;
            else
                count+=1;
        }
        return count;

    }
}














// class Solution {
//     public int minimumLength(String s) {
//         int freq[]=new int[26];
//         int count=0;
//         for(byte b:s.getBytes())
//             freq[b-97]++;

//         for(int i=0;i<26;i++)
//         {
//             if(freq[i]>=3)
//                 count+=(((freq[i]-3)/2)+1)*2;
//         }
//         return s.length()-count;

//     }
// }