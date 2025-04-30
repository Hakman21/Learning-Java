import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add(0, "Mazda");
        Collections.sort(cars);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        cars.get(3);
        cars.set(0, "Opel");
        cars.remove("Opel");
        cars.remove(2);
        System.out.println(cars);
        cars.clear();

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(25);
        myNumbers.add(20);
        myNumbers.add(15);
        for (int i : myNumbers) {
            System.out.println(i);
        }
        Collections.sort(myNumbers);
        System.out.println(myNumbers);
    }
}