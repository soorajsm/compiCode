class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long>minHeap=new PriorityQueue<>();
        for(int n:nums)
            if(n<k)
                minHeap.add((long)n);
        int count=0;
        while(!minHeap.isEmpty())
        {
            Long a=minHeap.remove();
            count++;
            if(minHeap.isEmpty())
                break;
            Long b=minHeap.remove();
            Long res=2*a+b;
            if(res<k)
                minHeap.add(res);
        }
        return count;
    }
}