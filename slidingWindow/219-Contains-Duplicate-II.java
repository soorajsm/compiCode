class Solution {
    public boolean containsNearbyDuplicate(int[] a, int k) {
        int n=a.length;
        Set<Integer> set=new HashSet<Integer>();
        
        for(int i=0;i<n;i++)
        {
            if(i>k)
                set.remove(a[i-k-1]);
                if(set.contains(a[i]))
                    return true;
                else
                    set.add(a[i]);
        }

        return false;
    }
}