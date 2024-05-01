import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void fizzBuzz(int n) {

        int i = 1;
        while (n >= i) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
//        fizzBuzz(15);
        List<String> result = level1Fizz(List.of(1, 2, 3, 4, 5, 6));
        System.out.println(result);
    }


    /**
     * Return a list where any number evenly divisible by 3 is replaced with
     * the word "Fizz". For example, given the list [1, 2, 3, 4, 5, 6] you
     * should return the following list of strings: ["1", "2", "Fizz", "4",
     * "5", "Fizz"]
     */
    public static List<String> level1Fizz(List<Integer> intList) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add(String.valueOf(intList.get(i)));
            }
        }

        return result;
    }


    /**
     * Return a list of strings where the following has been replaced:
     * - Any number evenly divisible by 3 with the word "Fizz".
     * - Any number evenly divisible by 5 with the word "Buzz".
     * - Any number evenly divisible by both 3 and 5 with the word
     * "FizzBuzz".
     * For example, given the list [12, 13, 14, 15, 16] you should return the
     * following list of strings: ["Fizz", "13", "14", "FizzBuzz", "16"]
     */
    public List<String> level2Fizzbuzz(List<Integer> intList) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) % 3 == 0 && intList.get(i) % 5 == 0) {
                result.add("FizzBuzz");
                continue;
            }
            if (intList.get(i) % 3 == 0) {
                result.add("Fizz");
            } else if (intList.get(i) % 5 == 0) {
                result.add("Buzz");
            }
            else {
                result.add(String.valueOf(intList.get(i)));
            }
        }

        return result;
    }

}
