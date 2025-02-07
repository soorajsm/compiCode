class Solution {
    public int longestPalindrome(String s) {
        int[] count=new int[128];
        int res=0,max=0;
        boolean oddIsThere=false;
        for(char ch:s.toCharArray()){
            count[ch]++;
        }
        for(int i=0;i<count.length;i++)
        {
            if((count[i]&1)!=1) // if it is even 
                res+=count[i];  // add all characters to result
            else
            {// if odd then find the add count by decrementing by one
                res+=count[i]-1;
                oddIsThere=true;
            } 
        }
        if(oddIsThere)
            return res+1;   // if odd exits we can use one odd element fully in the middle without decrementing by one
        return res; 
    }
}







// class Solution {
//     public int longestPalindrome(String s) {
//         int oddCount = 0;
//         Map<Character, Integer> map = new HashMap<>();
//         for (char ch : s.toCharArray()) {
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//             if (map.get(ch) % 2 == 1)
//                 oddCount++;
//             else
//                 oddCount--;
//         }
//         if (oddCount > 1)
//             return s.length() - oddCount + 1;
//         return s.length();
//     }
// }