package TIER2.task16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatePaymentSequenceTest {

    @Test
    public void testValidatePaymentSequence() {
        int [] transactions = {1, 2, 3, 4, 5};
        int [] dailyLimit = {6, 9};

        boolean result = ValidatePaymentSequence.validatePaymentSequence(transactions, dailyLimit);
        assertTrue(result);
    }

    @Test
    public void testValidatePaymentSequenceFalse() {
        int [] transactions = {7, 3, 4, 3};
        int [] dailyLimit = {7, 9};

        boolean result = ValidatePaymentSequence.validatePaymentSequence(transactions, dailyLimit);
        assertFalse(result);
    }
}
