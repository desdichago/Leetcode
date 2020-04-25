package Medium.P3LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int begin = 0;
        int end = 0;
        int max = 0;

        Set<Character> set = new HashSet<>(s.length());

        while (end < s.length()) {
            if (set.contains(s.charAt(end))) {
                set.remove(s.charAt(begin));
                begin++;
            } else {
                set.add(s.charAt(end));
                end++;
                max = Math.max(set.size(), max);
            }
        }

        return max;
    }
}