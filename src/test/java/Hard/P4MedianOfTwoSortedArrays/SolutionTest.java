package Hard.P4MedianOfTwoSortedArrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    SolutionLog solution;

    @Before
    public void setUp() {
        solution = new SolutionLog();
    }

    @Test
    public void findMedianSortedArrays1() {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        double expected = 2;
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void findMedianSortedArrays2() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        double expected = 2.5;
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void findMedianSortedArrays3() {
        int[] nums1 = new int[]{1, 2, 3, 4,  5,  6};
        int[] nums2 = new int[]{0, 0, 0, 0, 10, 10};
        double expected = 2.5;
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void findMedianSortedArrays4() {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{1, 2, 3};
        double expected = 2;
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void findMedianSortedArrays5() {
        int[] nums1 = new int[]{1, 2, 4, 5, 6, 7, 10};
        int[] nums2 = new int[]{2, 6};
        double expected = 5;
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0);
    }
}