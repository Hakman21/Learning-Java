import java.util.HashSet;
import java.util.Iterator;

// A HashSet is a collection of items where every item is unique
public class HashSets {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.contains("Mazda"));
        for (String i : cars) {
            System.out.println(i);
        }
        cars.remove("Volvo");
        cars.clear();
        System.out.println(cars);
        

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();

        System.out.println(it.next());

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //You can also use it.remove
    }
}