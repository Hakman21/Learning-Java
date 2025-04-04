public class Iteration {
    public static void main(String[] args) {
        // While loops

        int i = 0;
        while (i < 5) {
            System.out.println("i " + i);
            i++;
        }

        /*
        The do/while loop is a variant of the while loop. This loop will execute the code block once, 
        before checking if the condition is true, then it will repeat the loop as long as the condition is true.
        */

        int j = 0;
        do {
            System.out.println("J " + j);
            j++;
        }
        while (j < 5);


        // Example with selection
        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice += 1;
        }
    }
}