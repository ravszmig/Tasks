package TIER2.task1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class task1_fraud_detectionTest {

    @Test
    public void testFraudDetection() {
        int k = 1;
        int n = 3;

        List<task1_fraud_detection.Transaction> transactions = new ArrayList<>();

        transactions.add(
            new task1_fraud_detection.Transaction(
                "user1",
                1000
            )
        );

        transactions.add(
            new task1_fraud_detection.Transaction(
                "user1",
                2000
            )
        );

        transactions.add(
            new task1_fraud_detection.Transaction(
                "user1",
                3000
            )
        );

        transactions.add(
            new task1_fraud_detection.Transaction(
                "user2",
                1000
            )
        );

        transactions.add(
            new task1_fraud_detection.Transaction(
                "user2",
                400000
            )
        );

        transactions.add(
            new task1_fraud_detection.Transaction(
                "user1",
                400000
            )
        );

        List<String> result = task1_fraud_detection.fraudDetection(transactions, n, k);

        assertEquals(1, result.size(), "Should detect exactly one fraudulent user");
        assertTrue(result.contains("user1"), "user1 should be flagged as fraudulent");
    }

    @Test
    public void testFraudDetectionWithUnsortedTransactions() {
        int k = 1;  // 1 minute window
        int n = 3;  // 3 transactions threshold

        // Intentionally unsorted transactions
        List<task1_fraud_detection.Transaction> transactions = List.of(
            new task1_fraud_detection.Transaction("user1", 3000),  // Last
            new task1_fraud_detection.Transaction("user2", 1000),
            new task1_fraud_detection.Transaction("user1", 1000),  // First
            new task1_fraud_detection.Transaction("user1", 400000),  // Outside window
            new task1_fraud_detection.Transaction("user1", 2000),  // Middle
            new task1_fraud_detection.Transaction("user2", 400000)
        );

        List<String> result = task1_fraud_detection.fraudDetection(transactions, n, k);

        assertEquals(1, result.size(), "Should detect exactly one fraudulent user");
        assertTrue(result.contains("user1"), "user1 should be flagged as fraudulent (3 txns in 1 min window)");
    }
}
