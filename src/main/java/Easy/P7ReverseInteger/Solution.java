package Easy.P7ReverseInteger;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 * Input: 123
 * Output: 321
 *
 * Example 2:
 * Input: -123
 * Output: -321
 *
 * Example 3:
 * Input: 120
 * Output: 21
 *
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

class Solution {
    public int reverse(int original) {
        boolean negative = false;

        if (original < 0) {
            negative = true;
            original = Math.abs(original);
        }

        long reversed = 0;

        while (original > 0) {
            int last_digit = original % 10;
            original = original / 10;
            reversed = reversed * 10 + last_digit;
        }

        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        }

        if (negative) {
            return (int) -reversed;
        } else {
            return (int) reversed;
        }
    }
}