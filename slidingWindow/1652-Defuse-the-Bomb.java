class Solution {
    public int[] decrypt(int[] code, int k) {
        if (k == 0) return new int[code.length];
        
        int n = code.length;
        int ksum = 0;
        int[] res = new int[n];
        
        // build k size sum.
        if (k > 0) {
            for (int i = 0; i < k; i++) ksum += code[i];
            
        } else {
            for (int i = n - 1; i >= (n + k); i--) ksum += code[i];
        }
        
        for (int i = 0; i < n; i++) {
                int next = code[((n + i + k) % n)];
                int curr = code [i];
                
                if (k > 0) {
                    res[i] = ksum - curr + next;
                    ksum = res[i];
                }
                else {
                    res[i] = ksum;
                    ksum = ksum + curr - next; 
                }
                
        }
        return res;
    }
}