class Solution {
    public int maxArea(int[] a) {
        int i=0,j=a.length-1;
        int water=Integer.MIN_VALUE;
        while(i<j)
        {

            if(a[i]<=a[j])
            {
                water=Math.max(water,(j-i)*a[i]);
                i++;
            }
            else
            {
                water=Math.max(water,(j-i)*a[j]);
                j--;
            }
        } 
        return water;
    }
}