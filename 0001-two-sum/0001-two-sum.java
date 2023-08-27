class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int a = i + 1; a < nums.length; a++) {
                sum = nums[i] + nums[a];
                if (sum == target) {
                    result[0] = i;
                    result[1] = a;
                    return result;
                }
            }
        }
        return result;
    }
}