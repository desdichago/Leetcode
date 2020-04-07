package Easy.P1TwoSum;


import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void twoSum() {
        int[] input = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};
        Solution solution = new Solution();
        int[] actual = solution.twoSum(input, target);
        Assert.assertArrayEquals(expected, actual);
    }
}