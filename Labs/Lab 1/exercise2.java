import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        String[][] word_square3 = {{"T", "O", "O"}, {"U", "R", "N"}, {"B", "E", "E"}};
        String[][] word_square4 = {{"L", "I", "M", "B"},{"A", "R", "E", "A"},{"C", "O", "R", "K"},{"K", "N", "E", "E"}};
        String[][] word_square5 = {{"S", "C", "E", "N", "T"},{"C", "A", "N", "O", "E"},{"A", "R", "S", "O", "N"},{"R", "O", "U", "S", "E"},{"F", "L", "E", "E", "T"}};
        String[][] word_square_diag = {{"B", "A", "R", "N"},{"A", "R", "E", "A"},{"L", "I", "A", "R"},{"L", "A", "D", "Y"}};

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Row Or Column Or Diagonal? ");
        String option = scanner.nextLine();
        switch (option.toLowerCase()) {
            case "row" -> {
                System.out.println("Enter index: ");
                int index = scanner.nextInt();
                printRow(word_square5, index);
            }
            case "column" -> {
                System.out.println("Enter index: ");
                int index = scanner.nextInt();
                printColumn(word_square5, index);
            }
            case "diagonal" -> {
                System.out.println("Top Left Or Top Right? ");
                String direction_str = scanner.nextLine();
                boolean direction;
                if (direction_str.equalsIgnoreCase("left")) {
                    direction = true;
                    printDiagonal(word_square_diag, direction);
                } else if (direction_str.equalsIgnoreCase("right")) {
                    direction = false;
                    printDiagonal(word_square_diag, direction);
                } else {
                    System.out.println("Invalid Input");
                }
            }
            default -> System.out.println("Invalid Option");
        }

        scanner.close();
    }

    public static void printRow(String[][] word_square5, int index) {
        for (int i = 0; i < word_square5.length; i++) {
            System.out.print(word_square5[index][i]);
        }
    }

    public static void printColumn(String[][] word_square5, int index) {
        for (int i = 0; i < word_square5.length; i++) {
            System.out.print(word_square5[i][index]);
        }
    }

    public static void printDiagonal(String[][] word_square_diag, boolean direction) {
        for (int i = 0, j = 0; i < word_square_diag.length; i++, j++) {
            if (direction) {
                System.out.print(word_square_diag[i][j]);
            } else {
                System.out.print(word_square_diag[i][word_square_diag.length - 1 - j]);
            }

        }
    }
}