package TIER2.task18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateTransactionSequenceTest {

    @Test
    public void testValidateTransactionSequence() {

        int[] transactions = {2, 3, 2, 7};
        boolean isValid = ValidateTransactionSequence.validateTransactionSequence(transactions);
        assertTrue(isValid);
    }
}
