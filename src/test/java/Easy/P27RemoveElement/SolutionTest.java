package Easy.P27RemoveElement;

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
    public void removeElement1() {
        int[] inputArr = new int[]{3, 2, 2, 3};
        int inputVal = 3;
        int expected = 2;
        int actual = solution.removeElement(inputArr, inputVal);
        assertEquals(expected, actual);
    }

    @Test
    public void removeElement2() {
        int[] inputArr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int inputVal = 2;
        int expected = 5;
        int actual = solution.removeElement(inputArr, inputVal);
        assertEquals(expected, actual);
    }
}