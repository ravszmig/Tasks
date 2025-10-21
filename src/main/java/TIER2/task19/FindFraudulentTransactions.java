package TIER2.task19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindFraudulentTransactions {

    public static List<Integer> findFraudulentTransactions(int[] transactions, int threshold) {
        Set<Integer> fraudulentTransactions = new HashSet<>();
        double average = Arrays.stream(transactions)
            .average()
            .orElse(0);

        for(int i = 0; i < transactions.length; i++) {
            if(transactions[i] > threshold) {
                fraudulentTransactions.add(i);
            }

            if(i < transactions.length-2 && transactions[i] + transactions[i+1] + transactions[i+2] > average*3) {
                fraudulentTransactions.add(i);
                fraudulentTransactions.add(i+1);
                fraudulentTransactions.add(i+2);
            }
        }

        return fraudulentTransactions.stream().sorted().toList();
    }
}
