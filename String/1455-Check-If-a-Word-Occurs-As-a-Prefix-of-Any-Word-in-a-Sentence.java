class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int count=1;
        for(String s:sentence.split(" "))
        {
            if(s.startsWith(searchWord))
                return count;
            count++;
        }
        return -1;
    }
}