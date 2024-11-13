class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];
        for(int c : s.toCharArray()){
            freq[c - 'a']++;
        }
        for(int c : t.toCharArray()){
            freq[c - 'a']--;
        }
        int res = 0;
        for(int i : freq){
            if(i > 0){
                res += i;
            }
        }
        return res;
    }
}