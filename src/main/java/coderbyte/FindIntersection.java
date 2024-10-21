package coderbyte;

import java.util.Arrays;

class Main {

    public static String FindIntersection(String[] strArr) {

        String[] s1 = strArr[0].split(", ");
        String[] s2 = strArr[1].split(", ");

        StringBuilder result = new StringBuilder();

        if(s1.length >= s2.length) {
            for(String s : s1) {
                if(Arrays.asList(s2).contains(s)){
                    result.append(s).append(",");
                }
            }
        }

        return !result.isEmpty() ? result.deleteCharAt(result.length()-1).toString() : "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.print(FindIntersection(new String[] {"2, 5, 7, 10, 11, 12", "2, 7, 8, 9, 10, 11, 15"}));
    }

}