package TIER2.task9;

public class FirstNonRepeatingChar {

    public static int firstNonRepeatingChar(String str) {
        int[] frequency = new int[26];

        for(char c : str.toCharArray()) {
            frequency[c - 'a']++;
        }

        for(int i = 0; i < str.length(); i++) {
            if(frequency[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

}
