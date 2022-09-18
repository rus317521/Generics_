public class Main {
    public static void main(String[] args) {
        String[] items1 = new String[5];
        MagicBox<String> magicBox1 = new MagicBox<String>(5);
        magicBox1.add("Stroka1");
        System.out.println(magicBox1.add("Stroka1"));
        System.out.println(magicBox1.add("Stroka2"));
        System.out.println(magicBox1.add("Stroka3"));
        System.out.println(magicBox1.add("Stroka4"));
        magicBox1.pick();
        System.out.println(magicBox1.add("Stroka5"));
        System.out.println("Случайный элемент коробки со строками: " + magicBox1.pick());
        System.out.println(magicBox1.add("Stroka6"));

        Integer[] items2 = new Integer[4];
        MagicBox<Integer> magicBox2 = new MagicBox<>(4);
        magicBox2.add(101);
        magicBox2.add(102);
        magicBox2.add(103);
        magicBox2.pick();
        magicBox2.add(104);
        System.out.println("Случайный элемент коробки с числами: " + magicBox2.pick());
        magicBox2.add(105);
    }
}
