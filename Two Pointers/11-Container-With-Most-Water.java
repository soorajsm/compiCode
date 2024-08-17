class Solution {
    public int maxArea(int[] a) {
        int i=0,j=a.length-1;
        int water=Integer.MIN_VALUE;
        while(i<j)
        {
            int min=Math.min(a[i],a[j]);
            water=Math.max(water,Math.abs(i-j)*min);
            if(a[i]<=a[j])
                i++;
            else
                j--;
        } 
        return water;
    }
}