package Easy.P26RemoveDuplicatesFromSortedArray;

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
    public void removeDuplicates1() {
        int[] input = new int[]{1, 1, 2};
        int expected = 2;
        int actual = solution.removeDuplicates(input);
        assertEquals(expected, actual);
    }

    @Test
    public void removeDuplicates2() {
        int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expected = 5;
        int actual = solution.removeDuplicates(input);
        assertEquals(expected, actual);
    }
}