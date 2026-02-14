package playingWithObject;

// passing object reference to method

class Box {
    
}
class Bottle {
    
 }

public class MainApp2 {
  
    public static void main(String[] args) {

        Box b1 = new Box();
        printRef(b1);

        Box b2 = new Box();
        printRef(b2);

        Bottle a1 = new Bottle();
        printRef(a1);
    }


    public static void printRef(Box b) {
        System.out.println(b);
    }

    public static void printRef(Bottle b) {
        System.out.println(b);
    }
}

