package TIER2.task18;

public class ValidateTransactionSequence {

    public static boolean validateTransactionSequence(int[] transactions) {
        int max = transactions[0];

        for(int i = 1; i < transactions.length; i++) {

            if(transactions[i] > max*2) {
                return true;
            }

            if(max < transactions[i]) {
                max = transactions[i];
            }
        }
        return false;
    }

}
