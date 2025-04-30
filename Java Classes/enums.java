// An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
enum Level {
    LOW,
    MEDIUM,
    HIGH
}
  
public class enums {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
  
        switch(myVar) {
            case LOW:
            System.out.println("Low level");
            break;
            case MEDIUM:
            System.out.println("Medium level");
            break;
            case HIGH:
            System.out.println("High level");
            break;
        }
    }
}
// An enum can, just like a class, have attributes and methods.
// The only difference is that enum constants are public, static and final