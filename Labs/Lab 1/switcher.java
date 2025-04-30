import java.util.Scanner;

public class switcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Month Name: ");
        String month = scanner.nextLine().trim();

        switch (month.toLowerCase()) {

            case "december", "january", "february" -> {
                System.out.println(month + " is in Winter!");
                if (month.toLowerCase() == "january") {
                    System.out.println("New Year, New Me!");
                }
            }
            case "march", "april", "may" -> System.out.println(month + " is in Spring!");
            case "june", "july", "august" -> {
                System.out.println(month + " is in Summer!");
                if (month.toLowerCase() == "august") {
                    System.out.println("Summer Vacation!");
                }
            }
            case "september", "october", "november" -> System.out.println(month + " is in Autumn!");
            default -> System.out.println("Invalid Month!");
        }

        scanner.close();
    }
}