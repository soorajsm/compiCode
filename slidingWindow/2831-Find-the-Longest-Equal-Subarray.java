class Solution {
    public int longestEqualSubarray(List<Integer> a, int k) {
    // Map<Integer,Integer>map=new HashMap<>();
    int max=0,we=0,n=a.size();
    int count[]=new int[n+1];
    for(int ws=0;ws<n;ws++)
    {
        int ele=a.get(ws);
        count[ele]++;
        max=Math.max(max,count[ele]);
        if(ws-we+1-max>k)
        {
            int last=a.get(we);
            count[last]--;
            we++;
        }
    }
    return max;























        // int ws=0;
        // int n=a.size(),max=0;
        // Map<Integer,Integer>map=new HashMap<>();

        // for(int we=0;we<n;we++)
        // {
        //     int ele=a.get(we);
        //     map.put(ele,map.getOrDefault(a.get(we),0)+1);
        //     max=Math.max(max,map.get(a.get(we)));
        //     if(we-ws+1-max>k)
        //     {
        //         map.put(a.get(ws),map.get(a.get(ws))-1);
        //         ws++;
        //     }
        // }
        // return max;
    }
}