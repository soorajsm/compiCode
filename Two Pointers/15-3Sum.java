class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        Arrays.sort(a);
        List<Integer>list;
        Set<List<Integer>>set=new HashSet<>();
        for(int i=0;i<a.length-2;i++)
        {
            if(i>0 && a[i]==a[i-1])
                continue;
            int j=i+1;
            int k=a.length-1;
            while(j<k)
            {
                int sum=a[i]+a[j]+a[k];
                if(sum==0)
                {
                    list=new ArrayList<>(Arrays.asList(a[i],a[j],a[k]));
                    set.add(list);
                    j++;
                    k--;
                    while(j<k && a[j]==a[j-1])  j++;
                    while(j<k && a[k]==a[k+1])  k--;
                }
                else if(sum<0)
                    j++;
                else
                    k--;
            }
        }
        return new ArrayList(set);
    }
}









// class Solution {
//     public List<List<Integer>> threeSum(int[] a) {
//         Set<List<Integer>> set=new HashSet<>();
//         Map<Integer,Integer>elements=new HashMap<>();
//         List<Integer>list;
//         int n=a.length;
//         Arrays.sort(a);
//         for(int i=0;i<n;i++)
//         {
//             for(int j=i+1;j<n;j++)
//             {
//                 int target= -(a[i]+a[j]);
//                 if(elements.containsKey(target) && elements.get(target)!=i && elements.get(target)!=j)
//                 {   list=new ArrayList<>();
//                     list.add(a[i]);
//                     list.add(a[j]);
//                     list.add(target);
//                     set.add(list);
//                 }
//             }
//             elements.put(a[i],i);
//         }
//         return new ArrayList<>(set);
//     }
// }