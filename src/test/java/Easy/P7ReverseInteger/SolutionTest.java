package Easy.P7ReverseInteger;

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
    public void reverse123() {
        int input = 123;
        int expected = 321;
        int actual = solution.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void reverseNegative123() {
        int input = -123;
        int expected = -321;
        int actual = solution.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void reverse120() {
        int input = 120;
        int expected = 21;
        int actual = solution.reverse(input);
        assertEquals(expected, actual);
    }
}