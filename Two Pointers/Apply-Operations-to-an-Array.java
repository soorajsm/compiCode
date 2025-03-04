class Solution {
    public int[] applyOperations(int[] a) {
        int n=a.length;
        int res[]=new int[n];
        int ind=0,i=0;
        for(i=0;i<n-1;i++)
        {
            if(a[i]!=0)
            {
                if(a[i]==a[i+1])
                {
                    res[ind++]=a[i]*2;
                    a[i+1]=0;
                }
                else
                    res[ind++]=a[i];
            }
        }
        res[ind]=a[i];
        return res;
    }
}

















//class Solution {
//     public int[] applyOperations(int[] a) {
//         int zeroCount=-1;
//         int n=a.length;
//         for(int i=0;i<n-1;i++)
//         {
//             if(a[i]==a[i+1])
//             {
//                 a[i]=a[i]*2;
//                 a[i+1]=0;
//                 i++;
//             }
//         }
//         for(int i=0;i<n-1;i++)
//         {
//             if(a[i]==0)
//             {
//                 zeroCount=i;
//                 break;
//             }
//         }
//         if(zeroCount==-1)
//             return a;
//         for(int i=zeroCount+1;i<n;i++)
//         {
//             if(a[i]!=0)
//             {
//                 a[zeroCount++]=a[i];
//                 a[i]=0;
//             }
//         }

//         return a;
//     }
// }