class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            if (nums[0] == val) {
                return 0;
            }

            return 1;
        }

        int i = 0;
        for (int j = 1; j <= nums.length - 1; j++) {
            if (nums[i] != val) {
                i++;
            }

            if (nums[i] == val && nums[j] != val) {
                nums[i] = nums[j];
                nums[j] = val;
            }
        }

        if (nums[i] != val) {
            i++;
        }

        return i;
    }
}
