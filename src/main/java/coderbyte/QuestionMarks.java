package coderbyte;

import java.util.Scanner;

class QuestionMarksMain {

    public static String QuestionsMarks(String str) {
        boolean res = false;
        char[] chars = str.toCharArray();

        int firstDigitVal = 0;
        int firstDigitPos = -1;

        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(chars[i])) {
                if(firstDigitPos < 0) {
                    firstDigitVal += Character.getNumericValue(chars[i]);
                    firstDigitPos = i;
                } else {
                    int count = 0;
                    if(firstDigitVal + Character.getNumericValue(chars[i]) == 10) {
                        for(int j = firstDigitPos; j<=i; j++) {
                            if(chars[j] == '?') {
                                count++;
                            }
                        }
                        if(count == 3) {
                            res = true;

                        } else {
                            return "false";
                        }
                    }

                    firstDigitVal = 0;
                    firstDigitPos = -1;
                }
            }
        }

        return String.valueOf(res);

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner("acc?7??sss?3rr1??????5");
        System.out.print(QuestionsMarks(s.nextLine()));
    }

}