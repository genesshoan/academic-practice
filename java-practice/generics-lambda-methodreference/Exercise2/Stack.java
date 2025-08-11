package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private final List<T> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }

    public  boolean isEmpty() {
        return list.isEmpty();
    }
}
