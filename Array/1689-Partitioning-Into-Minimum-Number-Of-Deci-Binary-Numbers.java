class Solution {
    int max=Integer.MIN_VALUE;
    public int minPartitions(String s) {
        int num=9;
        while(true)
        {
            if(s.contains(Integer.toString(num)))
                return num;
            num--;
        }
    }
}
    //     for(byte b:n.getBytes())
    //     {
    //         max=Math.max(max,b-'0');
    //     }
    //     return max;
    // }
// }