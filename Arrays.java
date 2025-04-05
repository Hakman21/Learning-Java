public class Arrays {
    public static void main(String[] args) {
        
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println(cars[0]);
        cars[0] = "Pagani";
        System.out.println(cars[0]);
        System.out.println(cars.length);

        // Loops through the whole array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        /*
        Loop Through an Array with For-Each

        for (type variable : arrayname) {
        ...
        }
        */

        for (String j : cars) {
            System.out.println(j);
        }

        // Example

        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;
        int length = ages.length;

        for (int age1 = 0; age1 < length; age1++) {
            sum += ages[age1];
        }
        avg = sum / length;

        System.out.println("Average ages: " + avg);

        float lowest_age = ages[0];

        for (int age2 : ages) {
            if (age2 <= lowest_age) {
                lowest_age = age2;
            }
        }

        System.out.println("Lowest Age: " + lowest_age);


        // Multidimensional arrays

        int[][] numbers = {{1, 2, 3 ,4}, {5, 6, 7, 8}};

        System.out.println(numbers[1][2]);
        numbers[1][3] = 10;
        System.out.println(numbers[1][3]);

        for (int n = 0; n < numbers.length; n++) {
            for (int m = 0; m < numbers[n].length; m++) {
                System.out.println(numbers[n][m]);
            }
        }

        System.out.println(numbers.length);
        System.out.println(numbers[0].length);
        System.out.println(numbers[1].length);
    }
}