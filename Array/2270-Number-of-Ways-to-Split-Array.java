
class Solution {
    public int waysToSplitArray(int[] nums) {
        long rsum=0,lsum=0;
        int count=0;
        for(int i:nums)
            rsum+=i;
        for(int i=0;i<nums.length-1;i++)
        {
            lsum+=nums[i];
            rsum-=nums[i];
            if(lsum>=rsum)
                count++;
        }
        return count;
    }
}




















// class Solution {
//     public int waysToSplitArray(int[] nums) {
//         int n=nums.length,count=0;
//         long presum[]=new long[n];
//         long sum=0;
//         for(int i=0;i<n;i++)
//         {
//             presum[i]=nums[i]+sum;
//             sum=presum[i];
//         }
//         long lastsum=presum[n-1];

//         for(int i=0;i<n-1;i++)
//         {
//             if(presum[i]>=lastsum-presum[i])
//                 count++;
//         }
//         return count;
//     }
// }
