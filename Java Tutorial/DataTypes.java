public class DataTypes { 
    public static void main(String[] args) {
        byte byte1 = 100;
        System.out.println(byte1);
        short short1 = 10000;
        System.out.println(short1);
        int int1 = 100000;
        System.out.println(int1);
        long long1 = 1000000000L;
        System.out.println(long1);

        float floaty = 3.33f;
        System.out.println(floaty);
        double doubly = 333.333333333333d;
        System.out.println(doubly);

        boolean is_java_fun = true;
        boolean am_i_dumb = false;

        System.out.println("Is Java Fun: " + is_java_fun);
        System.out.println("Am I Dumb: " + am_i_dumb);

        char myvar1 = 65, myvar2 = 66, myvar3 = 67;
        System.out.println(myvar1);
        System.out.println(myvar2);
        System.out.println(myvar3);

        String greeting = "Hello World!";
        System.out.println(greeting);

        /*
        Casting - going from smaller to larger is automatic but going the other way is manual, shown below
        Widening Casting: byte -> short -> char -> int -> long -> float -> double
        Narrowing Casting (manually): double -> float -> long -> int -> char -> short -> byte
        */

        int myint1 = 9;
        double mydouble1 = myint1; 

        System.out.println(myint1);
        System.out.println(mydouble1);

        double mydouble2 = 9.6969d;
        int myint2 = (int) mydouble2;

        System.out.println(mydouble2);
        System.out.println(myint2);

        // Real example

        int max_score = 500;
        int user_score = 420;

        float percentage = (float) user_score / max_score * 100f;
        System.out.println("Users percentage is: " + percentage + "%");
    }
}