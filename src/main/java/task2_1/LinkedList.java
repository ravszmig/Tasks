package task2_1;

import java.util.StringJoiner;

public class LinkedList<T> {
    Node head;

    private class Node {
        final T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(" -> ", "[", "]");
        Node currentNode = head;
        while (currentNode != null) {
            stringJoiner.add(currentNode.data.toString());
            currentNode = currentNode.next;
        }
        return stringJoiner.toString();
    }

    public void reverse() {
        if (head == null)
            return;

        Node prev = null;
        Node current = head;
        Node next = null;

        log(prev, current, next);

        while (current != null) {
            next = current.next;
            log(prev, current, next);
            current.next = prev;
            log(prev, current, next);
            prev = current;
            log(prev, current, next);
            current = next;
            log(prev, current, next);
        }
        head = prev;
    }

    private void log(Node prev, Node current, Node next) {
        String prevT = prev != null ? prev.data.toString() : "N";
        String currentT = current != null ? current.data.toString() : "N";
        String nextT = next != null ? next.data.toString() : "N";
        String currentNextT = current != null && current.next != null ? current.next.data.toString() : "N";

        System.out.println("[" + prevT + "]" + " [" + currentT + "]" + " [" + nextT + "]" + " || [" + currentNextT + "]");
    }
}
