package youtube.task3_stack;

import java.util.ArrayList;
import java.util.List;

public class StackListThreadSafe<T> {
    private List<T> array;
    private int top;

    public void StackList() {
        this.array = new ArrayList<>();
        top = -1;
    }

    public synchronized void push(T item) {
        array.add(item);
        top++;
    }

    public synchronized T pop() {
        if (top < 0) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = array.get(top);
        array.remove(top);
        top--;
        return item;
    }

    public synchronized T peek() {
        if (top < 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return array.get(top);
    }
}