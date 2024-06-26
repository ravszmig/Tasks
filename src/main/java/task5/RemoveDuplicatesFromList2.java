package task5;

import java.util.*;

public class RemoveDuplicatesFromList2 {

    public static <E>
    List<E> removeDuplicatesAndOrder(List<E> list) {
        return list.stream().distinct().sorted().toList();
    }
}
