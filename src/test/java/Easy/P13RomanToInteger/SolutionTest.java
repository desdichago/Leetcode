package Easy.P13RomanToInteger;

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
    public void romanToIntIII() {
        String input = "III";
        int expected = 3;
        int actual = solution.romanToInt(input);
        assertEquals(expected, actual);
    }

    @Test
    public void romanToIntIV() {
        String input = "IV";
        int expected = 4;
        int actual = solution.romanToInt(input);
        assertEquals(expected, actual);
    }

    @Test
    public void romanToIntIX() {
        String input = "IX";
        int expected = 9;
        int actual = solution.romanToInt(input);
        assertEquals(expected, actual);
    }

    @Test
    public void romanToIntLVIII() {
        String input = "LVIII";
        int expected = 58;
        int actual = solution.romanToInt(input);
        assertEquals(expected, actual);
    }

    @Test
    public void romanToIntMCMXCIV() {
        String input = "MCMXCIV";
        int expected = 1994;
        int actual = solution.romanToInt(input);
        assertEquals(expected, actual);
    }

}