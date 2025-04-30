public class modifiers {
    /*
    PUBLIC - ACCESSIBLE BY ANY OTHER CLASS
    PRIVATE - ONLY ACCESSIBLE IN THE DECLARED CLASS
    PROTECTED - ACCESSIBLE IN THE SAME PACKAHE AND SUBCLASSES

    FINAL - cannot be changed/overwridden
    STATIC - methods belong to the class rather than the object
    ABSTRACT - can only be used in abstract class and can only be used on methods
    TEANSIENT - methods and attributes are skipped when serializing the object
    SYNCHRONISED - methods can only be accessed by one thread at a time
    VOLATILE - value of attribute values are not cached

    */
    final int x = 10;
    final double PI = 3.14;
    public static void main(String[] args) {
        modifiers myObj = new modifiers();
        //myObj.x = 50; // will generate an error: cannot assign a value to a final variable
        //myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);

        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would output an error
    
        modifiers myObj2 = new modifiers(); // Create an object of Main
        myObj2.myPublicMethod(); // Call the public method
    }
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }
    
      // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }


}