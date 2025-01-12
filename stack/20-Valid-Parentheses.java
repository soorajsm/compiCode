class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
                stack.push(c);
            else
            {
                if(stack.isEmpty())
                    return false;

                if(Math.abs(stack.pop()-c)>2)
                    return false;
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}