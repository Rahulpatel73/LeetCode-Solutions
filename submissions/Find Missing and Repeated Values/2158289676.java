# Title: Find Missing and Repeated Values
# Submission ID: 2158289676
# Status: Accepted
# Date: 30 September 2026 at 20:43:34 GMT+5:30

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        
        int[] freq = new int[size + 1];

        for (int[] row : grid) {
            for (int num : row) {
                freq[num]++;
            }
        }

        int repeated = 0;
        int missing = 0;

        for (int i = 1; i <= size; i++) {
            if (freq[i] == 2)
                repeated = i;
            else if (freq[i] == 0)
                missing = i;
        }

        return new int[]{repeated, missing};
    }
}