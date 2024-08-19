class Solution {
    public int numberOfAlternatingGroups(int[] a) {
        int n=a.length;
        int count=0;
        for(int start=0;start<n;start++)
        {
            int end=(start+2)%n;
            if(a[start]!=a[(start+1)%n] && a[end]!=a[(start+1)%n])
                count++;
        }
        return count;
    }
}