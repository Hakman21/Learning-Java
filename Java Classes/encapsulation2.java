public class encapsulation2 {
    public static void main(String[] args) {
        encapsulation myObj = new encapsulation();
        // myObj.name = "H"; //Wont work as private
        // System.out.println(myObj.name); //Wont work as private
        myObj.setName("H");
        System.out.println(myObj.getName());
    }
}