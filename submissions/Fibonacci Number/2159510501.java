# Title: Fibonacci Number
# Submission ID: 2159510501
# Status: Accepted
# Date: 1 October 2026 at 23:44:43 GMT+5:30

class Solution {
    public int fib(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}