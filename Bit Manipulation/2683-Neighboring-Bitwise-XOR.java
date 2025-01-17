// let's us take original = [a,b,c,d,e]
// then derived = [a ^ b, b ^ c, c ^ d, d ^ e, e ^ a]
// If we perform XOR operation of all the elements of derived array then result should be zero beacause
// a ^ b ^ b ^ c ^ c ^ d ^ d ^ e ^ e ^ a = 0
// Hence if it results in zero then we can form the original array.

class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int res=0;
        for(int ele:derived)
            res^=ele;
        return res==0;
    }
}













// Using two Variables

// class Solution {
//     public boolean doesValidArrayExist(int[] derived) {
//         int a=0,b=0;
//         int n=derived.length;
//         if(n==1)
//         {
//             if(derived[0]==1)
//                 return false;    
//             return true;
//         }
//         if(derived[0]==1)
//         {
//             a=0;
//             b=1;
//         }
//         else
//         {
//             a=0;
//             b=0;
//         }
//         int first=a;
//         for(int i=1;i<n;i++)
//         {
//             if(i!=n-1)
//             {
//                 a=b;
//                 b=a^derived[i];
//             }
//             else
//             {
//                 if((first^b)!=derived[n-1])
//                     return false;
//             }
//         }
//         return true;
//     }
// }