// Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

// Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

// abstract class Animal {
//     public abstract void animalSound();
//     public void sleep() {
//         System.out.println("Zzz");
//     }
// }

// Animal myObj = new Animal(); // will generate an error

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}
  
  // Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
      // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}
  
class abstraction {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}