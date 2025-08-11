package Exercise2;

public class Array<T> {
    private final T[] array;

    @SuppressWarnings("unchecked")
    public Array() {
        array = (T[]) new Object[10];
    }

    public void printArray() {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public void swap(int i, int j) {
        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
