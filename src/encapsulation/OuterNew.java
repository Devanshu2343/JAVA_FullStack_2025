package encapsulation;

public class OuterNew {

    
    private class Inner {
        void display() {
            System.out.println("Inner class method called");
        }
    }

        public void test() {
        Inner i = new Inner();
        i.display();
    }
}
