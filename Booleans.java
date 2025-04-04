public class Booleans {
    public static void main(String[] args) {

        int x = 10;
        int y = 9;
        System.out.println("Is 10 greater than 9? " + (x > y));

        System.out.println("Is 10 equal to 10? " + (x == 10));
        System.out.println("Is 10 equal to 15? " + (x == 15));
        
        int voting_age = 18;
        int my_age;
        my_age = 19;

        if (my_age >= voting_age) {
            System.out.println("You Can Vote!");
        } else {
            System.out.println("Not Old Enough To Vote!");
        }
    }
}