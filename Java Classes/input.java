import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.println("Enter Username: ");
        String username = myInput.nextLine();
        System.out.println("Username is: " + username);

        myInput.close();
    }
}