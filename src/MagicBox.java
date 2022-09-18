import java.util.Random;

public class MagicBox<T> {
    public static int count;
    public T value;
    T[] itemsP;

    public MagicBox(int count) {
        this.count = count;
        T[] items = (T[]) new Object[count];
        for (int i = 0; i < items.length; i++) {
            items[i] = null;
        }
        itemsP = items;
    }

    public boolean add(T item) {
        boolean b;
        b = false;

        for (int j = 0; j < count; j++) {
            if (itemsP[j] == null) {
                itemsP[j] = item;
                b = true;
                break;
            }
        }

        return b;
    }

    public T pick() {
        int randomInt = 0;
        boolean bl = true;
        for (int i = 0; i < itemsP.length; i++) {
            if (itemsP[i] == null) {
                bl = false;
                int k = count - i;
                String str = Integer.toString(k);
                throw new RuntimeException("Коробка не полна, осталось заполнить " + str + " ячеек");
            }
        }
        if (bl == true) {
            Random random = new Random();
            randomInt = random.nextInt(itemsP.length); // джава подберёт случайное число от 0 до ЧИСЛО невключительно//
            return itemsP[randomInt];
        }
        return itemsP[randomInt];
    }

}
