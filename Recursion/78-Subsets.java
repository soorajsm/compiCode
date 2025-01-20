// Using Recursion

class Solution {
    int n=0;
    List<List<Integer>>res=new ArrayList<>();
    List<Integer>list=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int i=0;
        n=nums.length;
        fun(i,nums);
        return res;
    }

    public void fun(int i,int a[])
    {
        if(i>=n)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(a[i]);
        fun(i+1,a);
        list.remove(Integer.valueOf(a[i]));
        fun(i+1,a);

    }
}







// Using PowerSet Method

// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         int n=nums.length;
//         List<List<Integer>>res=new ArrayList<>();
//         List<Integer>list;
//         for(int i=0;i<(1<<n);i++)      //(1<<n) is same as pow(2,n)
//         {
//             list=new ArrayList<>();
//             for(int j=0;j<n;j++)
//             {
//                 if((i&(1<<j))!=0)
//                     list.add(nums[j]);
//             }
//             res.add(list);
//         }
//         return res;
//     }
// }