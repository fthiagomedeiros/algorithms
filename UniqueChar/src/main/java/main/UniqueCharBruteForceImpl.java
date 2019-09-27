package main;

public class UniqueCharBruteForceImpl implements UniqueCharValidation {

    public boolean hasUniquelyCharacteres(String phrase) {

        for (int i = 0; i < phrase.length()-1; i++) {
            for (int j = i+1; j < phrase.length(); j++) {
                if (phrase.charAt(i) == phrase.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

}
