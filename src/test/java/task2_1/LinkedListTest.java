package task2_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListTest {
    @Test
    void addNodes() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("s1");
        linkedList.add("s2");
        linkedList.add("s3");
        linkedList.add("s4");
        assertEquals("[s1 -> s2 -> s3 -> s4]", linkedList.toString());
    }

    @Test
    void reverseLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("s1");
        linkedList.add("s2");
        linkedList.add("s3");
        linkedList.add("s4");
        linkedList.reverse();
        assertEquals("[s4 -> s3 -> s2 -> s1]",
                linkedList.toString());
    }
    @Test
    void reverseIntegersLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.reverse();
        assertEquals("[5 -> 4 -> 3 -> 2 -> 1]",
                linkedList.toString());
    }

}

