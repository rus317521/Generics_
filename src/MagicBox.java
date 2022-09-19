import java.util.Random;

public class MagicBox<T> {
    private int count;
    private T value;
    private T[] itemsP;
    private Random random = new Random();

    public MagicBox(int count) {
        this.count = count;
        T[] items = (T[]) new Object[count];
        for (int i = 0; i < items.length; i++) {
            items[i] = null;
        }
        itemsP = items;
    }

    public boolean add(T item) {
        boolean boxNotFull;
        boxNotFull = false;

        for (int j = 0; j < count; j++) {
            if (itemsP[j] == null) {
                itemsP[j] = item;
                boxNotFull = true;
                break;
            }
        }

        return boxNotFull;
    }

    public T pick() {
        int randomInt = 0;
        boolean boxFull = true;
        for (int i = 0; i < itemsP.length; i++) {
            if (itemsP[i] == null) {
                boxFull = false;
                int countFreeCells = count - i;
                String countFreeStr = Integer.toString(countFreeCells);
                throw new RuntimeException("Коробка не полна, осталось заполнить " + countFreeStr + " ячеек");
            }
        }
        if (boxFull == true) {

            randomInt = random.nextInt(itemsP.length); // джава подберёт случайное число от 0 до ЧИСЛО невключительно//
            return itemsP[randomInt];
        }
        return itemsP[randomInt];
    }

}
