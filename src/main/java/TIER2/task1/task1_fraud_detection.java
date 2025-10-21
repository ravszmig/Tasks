package TIER2.task1;

import java.util.List;
import java.util.stream.Collectors;

public class task1_fraud_detection {

    public static List<String> fraudDetection(List<Transaction> transactions, int n, int k) {
        int windowsMilis = k * 60 * 1000;
        return transactions.stream()
            .collect(Collectors.groupingBy(Transaction::userId,
                Collectors.mapping(Transaction::timestamp, Collectors.toList())))
            .entrySet().stream()
            .filter(entry -> {
                List<Long> timestamps = entry.getValue().stream()
                    .sorted()
                    .toList();
                int left = 0;
                for (int right = 0; right < timestamps.size(); right++) {
                    while (timestamps.get(right) - timestamps.get(left) > windowsMilis) {
                        left++;
                    }
                    if (right - left + 1 >= n) {
                        return true;
                    }
                }
                return false;
            })
            .map(java.util.Map.Entry::getKey)
            .collect(Collectors.toList());
    }


    public record Transaction(String userId, long timestamp) {
    }
}
