public class Methods {
    public static void my_method(String fname, int age) {
        /*
        my__method() is the name of the method
        static means that the method belongs to the Main class and not an object of the Main class
        void means that this method does not have a return value
        */
        System.out.println(fname + " just got raped! He was " + age + " years old.");
    }

    public static void main(String[] args) {
        my_method("H", 19);
    }
}