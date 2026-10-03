# Title: Majority Element
# Submission ID: 2161283397
# Status: Accepted
# Date: 3 October 2026 at 22:21:30 GMT+5:30

class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}