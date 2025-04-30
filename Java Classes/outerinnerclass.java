class OuterClass {
    int x = 10;

    //IF WE MADE THIS PRIVATE IT WOULD THROW AN ERROR, CANT BE ACCESSEED FROM OUTSIDE THIS CLASS
    //IF WE MADE IT STATIC WE WONT NEED TO CREATE AN OBJECT OF THE OUTER CLASS
    class InnerClass {
        int y = 5;
        public int myInnerMethod() {
            System.out.println(x); //Can access attributes and methods of the outer class
            return y;
        }
    }
}
  
public class outerinnerclass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}