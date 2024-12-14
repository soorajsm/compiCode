class Solution {
    public long findScore(int[] nums) {
        int n=nums.length;
        long score=0;
        boolean see[]=new boolean[n];
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        
        for(int i=0;i<n;i++)
        {
            if(!see[arr[i][1]])
            {
                score+=arr[i][0];
                see[arr[i][1]]=true;
                if(arr[i][1]>0)  see[arr[i][1]-1]=true;
                if(arr[i][1]<n-1)  see[arr[i][1]+1]=true;
            }
        }
        return score;

    }
}