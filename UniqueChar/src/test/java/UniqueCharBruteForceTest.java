import main.UniqueCharBruteForceImpl;
import main.UniqueCharValidation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UniqueCharBruteForceTest {

    private UniqueCharValidation uniqueCharValidation;

    @BeforeEach
    void beforeEach() {
        uniqueCharValidation = new UniqueCharBruteForceImpl();
    }

    @ParameterizedTest
    @ValueSource(strings = { "t", "ta", "dani", "taxbc", "abcdefghijklmnopqrstuvxwyz", "abcd10jk" })
    void wordsWithUniqueCharacteresNoRepetition(String input) {
        boolean result = uniqueCharValidation.hasUniquelyCharacteres(input);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = { "tt", "taxx", "taxbcc", "abcdefghijklmnopqrstuvxwyzz", "hutg9mnd!nk9", "GeeksforGeeks" })
    void wordWithSingleLettersTestCase(String input) {
        boolean result = uniqueCharValidation.hasUniquelyCharacteres(input);
        assertFalse(result);
    }

}
