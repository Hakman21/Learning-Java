public class Maths {
    public static void main(String[] args) {
        
        int max_value = Math.max(5, 10);
        System.out.println(max_value);

        int x, y;
        x = 100;
        y = 150;
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(y, x));

        System.out.println(Math.sqrt(64));

        System.out.println(Math.abs(-2.424));

        System.out.println(Math.random()); // Random Number between 0 (Inclusive) and 1 (Exclusive)

        int random_num = (int)(Math.random() * 101); // Random Number between 0 and 100
        System.out.println(random_num);
    }
}