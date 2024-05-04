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


}