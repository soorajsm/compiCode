class Solution {
    public int passThePillow(int n, int time) {
        boolean direction=true;
        int i=1;
        while(time>0)
        {
            if(i==n)
                direction=false;
            else if(i==1)
                direction=true;
            if(direction)
                i++;
            else if(!direction)
                i--;
            time--;
        } 

        return i;
    }
}