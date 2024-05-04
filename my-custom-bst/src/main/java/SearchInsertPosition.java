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

        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int[] base = null;
        int low = 0;
        int high = nums.length - 1;
        base = findBase(nums, target);

        if (base != null) {
            return base;
        }

        boolean foundValue = false;

        while (low <= high) {

            // Calculate the midpoint in a way that avoids overflow
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                foundValue = true;
                return findTarget(mid, nums, target);
            } else if (nums[mid] > target) {
                // Search the left half
                high = mid - 1;
            } else {
                // Search the right half
                low = mid + 1;
            }
        }

        if (!foundValue) {
            return new int[]{-1, -1};
        }

        // If the target is not found, return the index where it could be inserted
        return base;
    }

    private int[] findBase(int[] nums, int target) {
        if (nums.length == 1) {
            int value = nums[0];
            if (value == target) {
                return new int[]{0, 0};
            }
        }
        return null;
    }

    private int[] findTarget(int mid, int[] nums, int target) {

        int[] range = new int[2];
        range[0] = mid;
        range[1] = mid;

        boolean lowerFound = false;
        boolean upperFound = false;

        if (mid == 0) {
            int start = 0;
            int end = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    end = i;
                    range[0] = start;
                    range[1] = end;
                }
            }
        } else if (mid > 0 && mid < nums.length) {
            int start = mid;
            int end = mid;

            while (!lowerFound || !upperFound) {  /**nums[start] == target || nums[end] == target*/
                if (!lowerFound && nums[start] == target) {
                    if (start > 0 && nums[start - 1] == target) {
                        start--;
                        range[0] = start;
                    } else {
                        start--;
                        lowerFound = true;
                    }
                }

                if (!upperFound && end + 1 <= nums.length - 1 && nums[end + 1] == target) {
                    end++;
                    range[1] = end;
                } else {
                    end++;
                    upperFound = true;
                }

            }
        }

        return range;

    }
}