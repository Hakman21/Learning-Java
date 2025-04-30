public class oopoop {
    int x = 5;
    final int y = 3;
    int z;
    public static void main(String[] args) {
        oopoop myObj = new oopoop();
        System.out.println(myObj.x);
        myObj.x = 40;
        //myObj.y = 50; THIS WONT WORK BECAUSE FINAL 
        myObj.z = 60;
        System.out.println(myObj.x);
        System.out.println(myObj.y);
        System.out.println(myObj.z);

        myMethod();     
        // myPublicMethod(); This would compile an error
        oopoop myObj2 = new oopoop();
        
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
        System.out.println("Public methods must be called by creating objects");
    }
}