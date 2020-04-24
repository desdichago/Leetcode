package Hard.P4MedianOfTwoSortedArrays;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * You may assume nums1 and nums2 cannot be both empty.
 *
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 *
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3)/2 = 2.5
 *
 * O(m+n) solution (linear):
 */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int pos1 = 0;
        int pos2 = 0;
        int posC = 0;

        int[] combined = new int[nums1.length + nums2.length];

        while (true) {
            if (pos1 == nums1.length) {
                System.arraycopy(nums2, pos2, combined, posC, nums2.length-pos2);
                break;
            }

            if (pos2 == nums2.length) {
                System.arraycopy(nums1, pos1, combined, posC, nums1.length-pos1);
                break;
            }

            if (nums1[pos1] < nums2[pos2]) {
                combined[posC] = nums1[pos1];
                pos1++;
            } else {
                combined[posC] = nums2[pos2];
                pos2++;
            }
            posC++;
        }

        if (combined.length % 2 == 0) {
            int left = combined[(combined.length/2) - 1];
            int right = combined[combined.length/2];
            return (double) (left+right)/2;
        } else {
            return combined[combined.length/2];
        }
    }
}