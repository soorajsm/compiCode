class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer>map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char arr[]=s.toCharArray();
        int curr=arr.length-1,next=curr-1,sum=map.get(arr[curr]);
        while(next>=0)
        {
            int currElement=map.get(arr[curr]);
            int nextElement=map.get(arr[next]);
            if(nextElement>=currElement)
                sum+=nextElement;
            else
                sum-=nextElement;
            curr--;
            next--;
        }
        return sum;
    }
}