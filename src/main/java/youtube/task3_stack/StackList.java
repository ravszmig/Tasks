package youtube.task3_stack;

import java.util.ArrayList;
import java.util.List;

public class StackList<T> {
    List<T> array;
    int top;

    StackList() {
        this.array = new ArrayList<>();
        top = -1;
    }

    public void push(T item) {
        array.add(item);
        top++;
    }

    public T pop() {
        return array.get(top--);
    }

    public T peek() {
        return array.get(top);
    }
}