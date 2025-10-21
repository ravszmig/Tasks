package TIER2.task16;

public class ValidatePaymentSequence {

    public static boolean validatePaymentSequence(int[] transactions, int[] dailyLimit) {
        if (transactions == null || transactions.length == 0 || dailyLimit == null || dailyLimit.length == 0) {
            return false;
        }

        int sum = 0;
        int limitIndex = 0;

        for (int transaction : transactions) {

            if (limitIndex >= dailyLimit.length) {
                return false;
            }

            if(sum + transaction > dailyLimit[limitIndex]) {
                limitIndex++;
                sum = 0;

                if (limitIndex >= dailyLimit.length || transaction > dailyLimit[limitIndex]) {
                    return false;
                }

                sum += transaction;
            } else {
                sum += transaction;
            }
        }

        return true;
    }
}
