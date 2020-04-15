package Easy.P14LongestCommonPrefix;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution;

    @Before
    public void prepare() {
        solution = new Solution();
    }

    @Test
    public void longestCommonPrefix1() {
        String[] input = new String[]{"flower","flow","flight"};
        String expected = "fl";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    public void longestCommonPrefix2() {
        String[] input = new String[]{"dog","racecar","car"};
        String expected = "";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual);
    }
}