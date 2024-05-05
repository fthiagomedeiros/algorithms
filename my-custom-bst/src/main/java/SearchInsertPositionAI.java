class SearchInsertPositionAI {

    // Method to perform binary search or return insertion point
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Return the insertion point if target is not found
        return low;
    }

    // Method to find the range of target values in the array
    public int[] searchRange(int[] nums, int target) {
        int start = findStartIndex(nums, target);
        if (start == -1) {
            return new int[] {-1, -1};
        }
        int end = findEndIndex(nums, target);
        return new int[] {start, end};
    }

    // Helper method to find the start index of the target
    private int findStartIndex(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

            if (nums[mid] == target) {
                result = mid;
            }
        }

        return result;
    }

    // Helper method to find the end index of the target
    private int findEndIndex(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            if (nums[mid] == target) {
                result = mid;
            }
        }

        return result;
    }
}