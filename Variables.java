public class Variables {
    public static void main(String[] args) {
        // HOW TO DECLARE VARIABLE type variableName = value;
        String name = "Hak";
        int age = 19;

        int my_num;
        my_num = 3;
        
        int second_num = 7;
        second_num = 17;

        /* This will generate an error as Final means it cant be changed
        final int static_num = 10;
        static_num = 15;
        */

        float floaty = 3.33f;
        boolean bool = true;
        char letter = 'X';

        String last_name = "man";
        String full_name = name + last_name;

        System.out.println("Hello " + name + last_name);
        System.out.println(full_name);
        System.out.println(age);
        System.out.println(my_num);
        System.out.println(second_num);
        System.out.println(my_num + second_num);
        System.out.println(floaty);
        System.out.println(bool);
        System.out.println(letter);

        int x, y, z;
        x = y = z = 50;
        System.out.println(x * y * z);
    }
}