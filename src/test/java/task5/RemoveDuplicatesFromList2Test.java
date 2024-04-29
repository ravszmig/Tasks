package task5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromList2Test {
    @Test
    void givenStringsThenRemovedDuplicates() {
        List<String> input = new ArrayList<>();
        input.add("c");
        input.add("b");
        input.add("b");
        input.add("d");
        input.add("c");
        input.add("a");
        List<String> result = RemoveDuplicatesFromList2.removeDuplicatesAndOrder(input);
        assertEquals("[a, b, c, d]", result.toString());
    }
    @Test
    void givenIntegersThenRemovedDuplicates() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(3);
        input.add(4);
        input.add(1);
        input.add(7);
        input.add(1);
        input.add(2);
        input.add(1);
        List<Integer> result = RemoveDuplicatesFromList2.removeDuplicatesAndOrder(input);
        assertEquals("[1, 2, 3, 4, 7]", result.toString());
    }

}
