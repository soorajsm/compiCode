class Solution {
    public boolean check(int[] a) {
        int n=a.length;
        int irregular=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>a[(i+1)%n])
                irregular++;
        }
        return (irregular>1)?false:true;
    }
}





// bruteforce

// class Solution {
//     public boolean check(int[] a) {
//         int n=a.length;
//         int minind=0;
//         for(int i=n-1;i>0;i--)
//         {
//             if(a[i-1]>a[i])
//             {
//                 minind=i;
//                 break;
//             }
//         }
//         int i=minind;
//         int count=n;
//         while(count-->1)
//         {
//             i=i%n;
//             if(a[i]>a[(i+1)%n])
//                 return false;
//             i++;
//         }
//         return true;
//     }
// }

