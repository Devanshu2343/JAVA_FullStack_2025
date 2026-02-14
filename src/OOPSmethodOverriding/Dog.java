package OOPSmethodOverriding;

 class Dog extends Animal {
	  @Override
	    public void walk() {
	        System.out.println("Dog walks on 4 legs");
	    }

	    @Override
	    public void sound() {
	        System.out.println("Dog barks");
	    }

}
