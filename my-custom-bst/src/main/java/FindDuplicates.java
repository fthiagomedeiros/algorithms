import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

//    https://leetcode.com/problems/find-the-duplicate-number/
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> founds = new HashMap<>();

        for (int each : nums) {
            if (founds.containsKey(each)) {
                return each;
            } else {
                founds.put(each,1);
            }
        }

        return -1;
    }
}