package main;

import java.util.Arrays;

public class UniqueCharSortingImpl implements UniqueCharValidation {

    public boolean hasUniquelyCharacteres(String phrase) {
        char[] charArray = phrase.toCharArray();
        Arrays.sort(charArray); // O(n log n) time complexity

        for (int i = 0; i < charArray.length - 1; i++) {

            if (charArray[i] == charArray[i+1]) {
                return false;
            }
        }

        return true;
    }
}
