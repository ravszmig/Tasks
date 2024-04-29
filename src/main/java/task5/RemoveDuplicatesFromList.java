package task5;

import java.util.*;

public class RemoveDuplicatesFromList {

    public static <E extends Comparable<E>>
    List<E> removeDuplicatesAndOrder(List<E> list) {
        Set<E> set = new LinkedHashSet<>(list);
        ArrayList<E> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList);

        return arrayList;
    }
}
