package OOPSmethodOverriding;



class Cat extends Animal{
	
	



	    @Override
	public void walk() {
		// TODO Auto-generated method stub
		super.walk();
		System.out.println("Cat walks softly on 4 legs");
	}

		@Override
	    public void sound() {
	        System.out.println("Cat meows");
	    }
	
}