public class Main {
    public static void main(String[] args) {
        //String[] items1 = new String[5];
        MagicBox<String> magicBox1 = new MagicBox<String>(5);
        System.out.println(magicBox1.add("Stroka1"));
        System.out.println(magicBox1.add("Stroka2"));
        System.out.println(magicBox1.add("Stroka3"));
        System.out.println(magicBox1.add("Stroka4"));
        System.out.println(magicBox1.add("Stroka5"));
        System.out.println("Случайный элемент коробки со строками: " + magicBox1.pick());
        System.out.println(magicBox1.add("Stroka6"));

        MagicBox<Integer> magicBox3 = new MagicBox<>(3);
        System.out.println(magicBox3.add(101));
        System.out.println(magicBox3.add(102));
        System.out.println(magicBox3.add(103));
        System.out.println("Случайный элемент коробки с числами: " + magicBox3.pick());

        MagicBox<Integer> magicBox2 = new MagicBox<>(4);
        System.out.println(magicBox2.add(101));
        System.out.println(magicBox2.add(102));
        System.out.println(magicBox2.add(103));
        magicBox2.pick();
    }
}
