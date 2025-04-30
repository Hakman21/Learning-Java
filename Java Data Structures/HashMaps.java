import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, String> CapitalCities = new HashMap<String, String>();

        CapitalCities.put("England", "London");
        CapitalCities.put("Germany", "Berlin");
        CapitalCities.put("Norway", "Oslo");
        CapitalCities.put("USA", "Washington DC");
        System.out.println(CapitalCities);
        System.out.println(CapitalCities.size());
        for (String i : CapitalCities.keySet()) {
            System.out.println(i);
        }
        for (String i : CapitalCities.values()) {
            System.out.println(i);
        }
        CapitalCities.get("England");
        CapitalCities.remove("England");
        CapitalCities.clear();

    }
}