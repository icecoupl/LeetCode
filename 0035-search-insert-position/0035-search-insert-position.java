class Solution {
    public int searchInsert(int[] nums, int target) {
        boolean flag = true;
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int mid = 0;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return left;
    }
}