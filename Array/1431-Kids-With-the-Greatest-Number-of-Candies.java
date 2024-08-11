class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        List<Boolean>list=new ArrayList<>();
        for(int i:candies)
        {
            max=Math.max(max,i);
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
                list.add(true);
            else
                list.add(false);

        }
        return list;
    }
}