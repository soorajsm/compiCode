class Solution {
    public int takeCharacters(String s, int k) {
       int start=0,n=s.length();
       int min=n;
       int a[]=new int[3];
       for(char c:s.toCharArray())
            a[c-'a']++;

        if(a[0]<k || a[1]<k || a[2]<k)
            return -1;

        for(int end=0;end<n;end++)
        {
            a[s.charAt(end)-'a']--;
            while(start<=end && (a[0]<k || a[1]<k || a[2]<k))
            {
                a[s.charAt(start)-'a']++;
                start++;
            }
            min=Math.min(min,n-(end-start+1));
        }
        return min;
    }
}