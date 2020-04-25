package Easy.P27RemoveElement;

class Solution {
    public int removeElement(int[] nums, int val) {

        int current = 0;

        for (int n : nums) {
            if (n != val) {
                nums[current++] = n;
            }
        }

        return current;
    }
}