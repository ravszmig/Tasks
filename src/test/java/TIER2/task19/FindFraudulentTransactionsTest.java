package TIER2.task19;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFraudulentTransactionsTest {

    @Test
    public void testFindFraudulentTransactions() {
       int[] transactions = {100, 200, 300, 400, 50};
       int threshold = 350;

       List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4);
       var result = FindFraudulentTransactions.findFraudulentTransactions(transactions, threshold);

       assertEquals(expectedResult, result);
    }
}
