import exceptions.EmptyArrayException;

public class Bst {

    public static int search(int[] array, int key) throws EmptyArrayException {

        if (array.length == 0) {
            throw new EmptyArrayException("No items in array");
        }

        int low = 0;
        int high = array.length - 1;
        int mid = high / 2;

        if (array[mid] == key) {
            return mid;
        }

        return 1;
    }

}
