package OOPSmethodOverriding;

public class MainApp {

    public static void main(String[] args) {

        Animal d1 = new Dog();
        d1.walk();
        d1.sound();

        Animal c1 = new Cat();
        c1.walk();
        c1.sound();
    }
}
