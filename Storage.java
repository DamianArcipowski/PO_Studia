public class Storage<T> {
    private T item;

    public Storage(T item) {
        this.item = item;
    }

    public T retrieve() {
        return item;
    }

    public void store(T item) {
        this.item = item;
    }
}
