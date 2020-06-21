import exceptions.EmptyArrayException;
import exceptions.NotFoundKey;

public class Bst {

    public static int search(int[] array, int key) throws EmptyArrayException, NotFoundKey {

        if (array.length == 0) {
            throw new EmptyArrayException("No items in array");
        }

        int low = 0;
        int high = array.length - 1;
        int mid = high / 2;

        while (low <= high) {
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                high = mid - 1;
                mid = (high - low) / 2;
            } else {
                low = mid + 1;
                mid = low + ((high - low) / 2);
            }
        }

        throw new NotFoundKey(String.format("No items in array with %s", key));
    }

}
