public class SearchInsertPosition {


    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            // Calculate the midpoint in a way that avoids overflow
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                // If the target is found, return the index
                return mid;
            } else if (nums[mid] > target) {
                // Search the left half
                high = mid - 1;
            } else {
                // Search the right half
                low = mid + 1;
            }
        }

        // If the target is not found, return the index where it could be inserted
        return low;
    }

    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            if (nums.length == 1) {
                int value = nums[0];
                if (value == target) {
                    return new int[]{0, 0};
                } else {
                    return new int[]{-1, -1};
                }
            }

            // Calculate the midpoint in a way that avoids overflow
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                // If the target is found, return the index

                int previous = mid - 1;
                int next = mid + 1;

                if (previous >= 0 && nums[previous] == target) {
                    return new int[]{previous, mid};
                } else if (next <= nums.length - 1 && nums[next] == target) {
                    return new int[]{mid, next};
                }

                return new int[]{mid, mid};
            } else if (nums[mid] > target) {
                // Search the left half
                high = mid - 1;
            } else {
                // Search the right half
                low = mid + 1;
            }
        }

        // If the target is not found, return the index where it could be inserted
        return new int[]{-1, -1};
    }


}