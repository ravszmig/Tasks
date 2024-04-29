package youtube.task3_stack;

import java.lang.reflect.Array;

public class Stack<T> {
    T[] array;
    int capacity;
    int top;

    Stack(Class<T> clazz, int c) {
        this.array = (T[]) Array.newInstance(clazz, c);
        this.capacity = c;
        top = -1;
    }

    public void push(T item) {
        isFull(capacity);
        this.array[++top] = item;
    }


    public T pop() {
        isEmpty();
        return array[top--];
    }

    public T peek() {
        isEmpty();
        return array[top];
    }

    private void isEmpty() {
        if(top == -1) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void isFull(int capacity) {
        if(top == capacity) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

}
