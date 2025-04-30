import java.util.LinkedList;
import java.util.Collections;

public class LinkedLists {
    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars);
        System.out.println(cars);
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println(cars);
    }
}

//Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

