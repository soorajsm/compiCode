
class Solution {
    public int[] twoSum(int[] a, int target) {
        int len=a.length;
        Map<Integer,Integer>map=new HashMap<>();
            
        for(int i=0;i<len;i++)
        {
            int no=target-a[i];
            if(map.containsKey(no) && i!=map.get(no))
                return new int[]{i,map.get(no)};

            map.put(a[i],i);
        }

        return new int[]{};
    }
}