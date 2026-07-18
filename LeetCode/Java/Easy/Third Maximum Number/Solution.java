class Solution {
    public int thirdMax(int[] nums) {

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;

        // Find maximum
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Find second maximum
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max && nums[i] > smax) {
                smax = nums[i];
            }
        }

        // Find third maximum
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max && nums[i] != smax && nums[i] > tmax) {
                tmax = nums[i];
            }
        }

        // Count distinct numbers
        int count = 0;

        if (max != Integer.MIN_VALUE)
            count++;

        if (smax != Integer.MIN_VALUE)
            count++;

        if (tmax != Integer.MIN_VALUE)
            count++;

        if (count < 3)
            return max;

        return tmax;
    }
}