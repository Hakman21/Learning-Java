public class oopoop {
    int x;
    int y;
    int z;
    int n;
    String name;
    // YOU MUST CREATE AN OBJECT OF THE CLASS TO CALL A PUBLIC. STATIC CAN BE ACESSED WHENEVER
    public oopoop(int m, String eman) { //CONSTRUCTOR METHOD RUNS TO SET INTIAL x AND y values
        x = 2;
        y = 3;
        n = m;
        name = eman;
    }

    public static void main(String[] args) {
        oopoop myObj = new oopoop(5, "H");
        System.out.println(myObj.x);
        myObj.x = 40;
        //myObj.y = 50; THIS WONT WORK BECAUSE FINAL 
        myObj.z = 60;
        System.out.println(myObj.x);
        System.out.println(myObj.y);
        System.out.println(myObj.z);
        System.out.println(myObj.n);
        System.out.println(myObj.name);

        myMethod();     
        // myPublicMethod(); This would compile an error
        oopoop myObj2 = new oopoop(5, "H");
        myObj2.myPublicMethod();

    }

    static void myMethod() {
        System.out.println("Tuff - Never PMO");
        System.out.println("I am not excited for ts exam");
        System.out.println("I am procrastinating");
        System.out.println("I will get an early night tonight");
        System.out.println("Then I will study hard tomorrow.");
        System.out.println("And then I will do very well in my exams");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be callby creating objects");
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
}