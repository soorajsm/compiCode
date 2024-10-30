class Solution {
    public int romanToInt(String s) {

        int curr=0,sum=0;
        for(int next=s.length()-1;next>=0;next--)
        {
            int nextEle=switch(s.charAt(next))
                        {
                            case 'I'-> 1;
                            case 'V'-> 5;
                            case 'X'-> 10;
                            case 'L'-> 50;
                            case 'C'-> 100;
                            case 'D'-> 500;
                            case 'M'-> 1000;
                            default -> -1;
                        };
            if(nextEle>=curr)
                sum+=nextEle;
            else
                sum-=nextEle;
            curr=nextEle;
        }
        return sum;
    }
}




    //     Using HashMap

    //     Map<Character,Integer>map=new HashMap<>();
    //     map.put('I',1);
    //     map.put('V',5);
    //     map.put('X',10);
    //     map.put('L',50);
    //     map.put('C',100);
    //     map.put('D',500);
    //     map.put('M',1000);

    //     char arr[]=s.toCharArray();
    //     int curr=arr.length-1,next=curr-1,sum=map.get(arr[curr]);
    //     while(next>=0)
    //     {
    //         int currElement=map.get(arr[curr]);
    //         int nextElement=map.get(arr[next]);
    //         if(nextElement>=currElement)
    //             sum+=nextElement;
    //         else
    //             sum-=nextElement;
    //         curr--;
    //         next--;
    //     }
    //     return sum;
    // }
