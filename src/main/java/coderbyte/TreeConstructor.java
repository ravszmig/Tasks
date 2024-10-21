package coderbyte;

import java.util.HashMap;
import java.util.Map;

class TreeConstructorMain {

    public static String TreeConstructor(String[] strArr) {

        Map<String, Integer> nodeChildren = new HashMap<>();

        for (String s : strArr) {
            String[] vals = s.substring(1, s.length() - 1).split(",");

            var present = nodeChildren.computeIfPresent(vals[1], (k,v) -> v + 1);
            if(present == null) {
                nodeChildren.put(vals[1], 1);
            }
        }

        return String.valueOf(nodeChildren.values().stream().allMatch(v-> v<=2));
    }

    public static void main(String[] args) {
        // keep this function call here
        System.out.print(TreeConstructor(new String[] {"(1,2)", "(3,2)", "(2,12)", "(5,2)"}));
    }

}