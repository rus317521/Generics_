import java.util.Random;

public class MagicBox<T> {
    public static int count;
    public T value;
    //public T[] items;
    // protected T[] items = (T[]) new Object[count];
    public T[] items;

    public <T> MagicBox(int count) {
        this.count = count;
        T[] items = (T[]) new Object[count];
        for (int i = 0; i < items.length; i++) {
            items[i] = null;
        }
    }

    public boolean add(T item) {
        boolean b;
        b = false;

        for (int j = 0; j < count; j++) {
            if (items[j] == null) {
                items[j] = item;
                b = true;
                break;
            }
        }

        return b;
    }

    public T pick() {
        int randomInt = 0;
        boolean bl = true;
        for (int i = 0; i < MagicBox.this.items.length; i++) {
            if (MagicBox.this.items[i] == null) {
                bl = false;
                int k = count - 1 - i;
                String str = Integer.toString(k);
                new RuntimeException("Коробка не полна, осталось заполнить " + str + " ячеек");
                randomInt = k;
                break;
            }
        }
        if (bl == true) {
            Random random = new Random();
            randomInt = random.nextInt(items.length); // джава подберёт случайное число от 0 до ЧИСЛО невключительно//
            return items[randomInt];
        }
        return items[randomInt];
    }

}
