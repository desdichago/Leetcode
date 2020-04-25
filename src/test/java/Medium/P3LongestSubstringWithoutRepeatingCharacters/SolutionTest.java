package Medium.P3LongestSubstringWithoutRepeatingCharacters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void lengthOfLongestSubstring1() {
        String input = "abcabcbb";
        int expected = 3;
        int actual = solution.lengthOfLongestSubstring(input);
        assertEquals(expected, actual);
    }

    @Test
    public void lengthOfLongestSubstring2() {
        String input = "bbbbb";
        int expected = 1;
        int actual = solution.lengthOfLongestSubstring(input);
        assertEquals(expected, actual);
    }

    @Test
    public void lengthOfLongestSubstring3() {
        String input = "pwwkew";
        int expected = 3;
        int actual = solution.lengthOfLongestSubstring(input);
        assertEquals(expected, actual);
    }
}