class Solution {
    public int singleNumber(int[] a) {
        int result=0;
        for(int i:a)
            result^=i;
        return result;
    }
}