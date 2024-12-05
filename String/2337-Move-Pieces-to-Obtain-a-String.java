class Solution {
    public boolean canChange(String start, String target) {
        int i = 0, j = 0;
        int len = start.length();

        while (i < len && j < len) {
            while (i < len && start.charAt(i) == '_') i++;
            while (j < len && target.charAt(j) == '_') j++;

            if (i == len || j == len) break;

            if (start.charAt(i) != target.charAt(j)) {
                return false;
            }

            if ((start.charAt(i) == 'R' && i > j) || (start.charAt(i) == 'L' && i < j)) {
                return false;
            }

            i++;
            j++;
        }

        while (i < len && start.charAt(i) == '_') i++;
        while (j < len && target.charAt(j) == '_') j++;

        return i == len && j == len;
    }
}
