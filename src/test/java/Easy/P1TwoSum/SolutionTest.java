package Easy.P1TwoSum;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution solution;

    @Before
    public void prepare() {
        solution = new Solution();
    }

    @Test
    public void twoSum() {
        int[] input = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};
        int[] actual = solution.twoSum(input, target);
        Assert.assertArrayEquals(expected, actual);
    }
}