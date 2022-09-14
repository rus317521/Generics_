public class MagicBox<T> {
    private int count;
    protected T value;

    public <T> MagicBox(int count) {
        this.count = count;
        //this.value = value;
        T arrayOfElements[] = new T[count] ;
    }

    public boolean add(T item)
    {}
    public T pick()
    {}

}
