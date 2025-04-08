// With method overloading, multiple methods can have the same name with different parameters:

public class Methods2 {
    static int my_method(int x, int y) {
        return x + y;
    }

    // Here we have plus_method twice, one with int one with double so it works either way - this is method overloading
    static int plus_method(int n, int m) {
        return n + m;
    }
    static double plus_method(double n, double m) {
        return n + m;
    }


    public static void main(String[] args) {
        int z = my_method(5, 95);
        System.out.println(z);
        System.out.println(plus_method(5, 95));
        System.out.println(plus_method(6.9, 4.2));
    }
}

