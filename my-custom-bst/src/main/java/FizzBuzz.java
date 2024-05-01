import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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


    /**
     * Reverse the given input and return the result
     */
    public static String reverseString(String inputString) {
        // Write your code here

        StringBuilder temp = new StringBuilder();

        int textSizeIndex = inputString.length() - 1;
        while (textSizeIndex >= 0) {
            temp.append(inputString.charAt(textSizeIndex));
            textSizeIndex--;
        }
        return temp.toString();
    }

    public static void main(String[] args) {
//        fizzBuzz(15);
//        List<String> result = level1Fizz(List.of(1, 2, 3, 4, 5, 6));
//        System.out.println(result);
//            reverseString("Thiago");

        //int result = level1WordCount("The quick brown fox jumps over the lazy dog.");
//        List<String> result2 = level2WordSorting("The quick brown fox jumps over the lazy dog, ant, AN");

//        String sentence = "this is a test sentence is is test";
//        List<String> sortedWords = level3SortByOccurrences(sentence);
//        System.out.println(sortedWords);
    }



    /**
     * Take a sentence as input and count the number of words and return it
     * as an int.
     */
    public static int level1WordCount(String sentence) {
        String[] result = sentence.split(" ");
        return result.length;
    }


    /**
     * Take a sentence as input and return a list of the words in the
     * sentence, sorted alphabetically in lowercase and without punctuation
     * (,.!?). If there are multiple occurrences of the same word, include it
     * multiple times.
     */
    public static List<String> level2WordSorting(String sentence) {
        List<String> result = new ArrayList<>();
        String[] inputSentence = sentence.split(" ");

        for (int i = 0; i < inputSentence.length; i++) {
            String current = inputSentence[i];
            current = current.replaceAll("\\p{Punct}", "");
            result.add(current.toLowerCase());
        }

        Collections.sort(result);
        return result;
    }



    /**
     * Take a sentence as input and sort the words in it by the number of
     * times they appear in the sentence. In the case of a tie, the words
     * should be sorted alphabetically.
     */
    public static List<String> level3SortByOccurrences(String sentence) {
//        Map<String, Integer> wordCount = new HashMap<>();
//
//        String[] inputSentence = sentence.split(" ");
//
//        for (int i = 0; i < inputSentence.length; i++) {
//            String current = inputSentence[i].replaceAll("\\p{Punct}", "").toLowerCase();
//            wordCount.put(current, wordCount.getOrDefault(current, 0) + 1);
//        }
//
//        wordCount.containsKey();
//
//        String.format("%s-%s", 1,2);
//        List<String> sortedWords = new ArrayList<>(wordCount.keySet());
//
//        sortedWords.sort((a, b) -> {
//            int freqComparison = wordCount.get(b).compareTo(wordCount.get(a));
//            if (freqComparison != 0) {
//                return freqComparison; // Sort by frequency if frequencies are different
//            } else {
//                return a.compareTo(b); // Sort alphabetically if frequencies are the same
//            }
//        });
//
        return null;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    static class Word implements Comparable<Word> {
        private int occurrence;
        private String word;

        @Override
        public int compareTo(Word obj) {
            if (!this.toString().equalsIgnoreCase(obj.toString())) {
                return Integer.compare(this.occurrence, obj.occurrence);
            }
            return 0;
        }

        @Override
        public String toString() {
            return word;
        }
    }

    private ApiCaller api;

    public FizzBuzz(ApiCaller api) {
        this.api = api;
    }

    /**
     * Return the day which you buy silver. The first day has number zero.
     * This method is called first, and only once.
     */
    public int getBuyDay() {

        int dayToBuy = Integer.MIN_VALUE;
        int MAX_PRICE_FOUND = Integer.MIN_VALUE;

        for (int day = 0; day < api.getNumDays() - 2; day++) {
            int priceCurrentDay = api.getPriceOnDay(day);

            for (int j = day + 1; j < api.getNumDays() - 1; j++) {
                int nextDaysPrice = api.getPriceOnDay(j);

                String key = day + "-" + j + " " + (nextDaysPrice - priceCurrentDay);
                int price = nextDaysPrice - priceCurrentDay;

                if (price > MAX_PRICE_FOUND) {
                    MAX_PRICE_FOUND = price;
                    dayToBuy = day;
                }
            }
        }
        return dayToBuy;
    }

    public int getSellDay() {
        int dayToSell = Integer.MIN_VALUE;
        return -1;
    }

}
