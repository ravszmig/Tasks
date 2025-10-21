package TIER2.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPharentesiesCheckerTest {


    @Test
    void test_ValidPharentesiesChecker() {
        // ([{
        // }])
        String sValid = "([{}])";

        // ({[{
        // }}])
        String sValid2 = "({}[{}])";

        String sInvalid = "(]";

        boolean valid = ValidPharentesiesChecker.check(sValid);
        boolean valid2 = ValidPharentesiesChecker.check(sValid2);
        boolean invalid = ValidPharentesiesChecker.check(sInvalid);

        assertTrue(valid);
        assertTrue(valid2);
        assertFalse(invalid);


    }
}
