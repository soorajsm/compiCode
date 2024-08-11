class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int res = 0;

        // for(int i = 0; i < commands.size(); i++) {
        //     String command = commands.get(i);

        //     if(command.equals("UP")) {
        //         pos -= n;
        //     } else if(command.equals("DOWN") ) {
        //         pos += n;
        //     } else if(command.equals("RIGHT") ) {
        //         pos += 1;
        //     } else if(command.equals("LEFT")) {
        //         pos -= 1;
        //     }
        // }
        for(String s:commands)
        {
            if(s.startsWith("U"))
                res-=n;
            else if(s.startsWith("D"))
                res+=n;
            else if(s.startsWith("L"))
                res-=1;
            else
                res+=1;
        }

        return res;
    }
}
