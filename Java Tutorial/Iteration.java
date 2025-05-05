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


        /*
        for (statement 1; statement 2; statement 3) {
        // code block to be executed
        }

        Statement 1 is executed (one time) before the execution of the code block.
        Statement 2 defines the condition for executing the code block.
        Statement 3 is executed (every time) after the code block has been executed.
        */
        
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }

        for (int a = 0; a <= 10; a += 2) {
            System.out.println(a);
        }

        // Nested loops
        for (int p = 1; p <= 2; p++) {
            System.out.println("Outer: " + p);
            for (int q = 1; q <= 3; q++) {
                System.out.println("Inner: " + q);
            }
        }

        /*
        There is also a "for-each" loop, which is used exclusively to loop through elements in an array (or other data sets):

        for (type variableName : arrayName) {
        // code block to be executed
        }
        */

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String b : cars) {
            System.out.println(b);
        }


        for (int o = 0; o <= 10; o++) {
            if (o == 4) {
                break; // Breaks out of the loop when o = 4
            }
            System.out.println(o + "PF");
        }

        for (int n = 0; n <= 10; n++) {
            if (n == 4) {
                continue; // Continues to the next iteration (skips the 4th)
            }
            System.out.println(n + "PF");
        }

        int z = 0;
        while (z < 10) {
            System.out.println("Z: " + z);
            z++;
            if (z == 4) {
                break;
            }
        }

        int x = 0;
        while (x < 10) {
            x++;
            if (x == 4) {
                continue;
            }
            System.out.println("X: " + x);
        }
    }
}