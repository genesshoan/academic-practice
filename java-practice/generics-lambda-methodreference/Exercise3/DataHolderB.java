package Exercise3;

public class DataHolderB<T> {
    private T data;

    public DataHolderB(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}