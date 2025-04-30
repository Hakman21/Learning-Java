public class Wrappers {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(myInt);

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());


        Integer my_number = 100;
        String my_string = my_number.toString();
        System.out.println(my_string.length());
    }
}