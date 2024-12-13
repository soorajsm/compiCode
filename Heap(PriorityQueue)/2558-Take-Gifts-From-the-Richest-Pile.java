class Solution {
    public long pickGifts(int[] gifts, int k) {
        Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        long res=0;
        for(int i:gifts)
            pq.add(i);
        while(k-->0)
        {
            res=pq.poll();
            pq.add((int)Math.floor(Math.sqrt(res)));
        }

        res=0;
        while(!pq.isEmpty())
            res+=pq.poll();

        return res;
    }
}