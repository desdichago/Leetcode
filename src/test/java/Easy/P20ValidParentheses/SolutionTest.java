package Easy.P20ValidParentheses;

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
    public void isValid1() {
        String input = "()";
        boolean expected = true;
        boolean actual = solution.isValid(input);
        assertEquals(expected, actual);
    }

    @Test
    public void isValid2() {
        String input = "()[]{}";
        boolean expected = true;
        boolean actual = solution.isValid(input);
        assertEquals(expected, actual);
    }

    @Test
    public void isValid3() {
        String input = "(]";
        boolean expected = false;
        boolean actual = solution.isValid(input);
        assertEquals(expected, actual);
    }

    @Test
    public void isValid4() {
        String input = "([)]";
        boolean expected = false;
        boolean actual = solution.isValid(input);
        assertEquals(expected, actual);
    }

    @Test
    public void isValid5() {
        String input = "{[]}";
        boolean expected = true;
        boolean actual = solution.isValid(input);
        assertEquals(expected, actual);
    }
}