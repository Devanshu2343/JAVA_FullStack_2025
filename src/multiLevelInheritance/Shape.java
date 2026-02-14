package multiLevelInheritance;

public class Shape {
	String property ;
	int sides ;
	
	Shape(){
		
	}
	Shape (String property){
		this.property = property ;
	}
	Shape (String property , int sides){
		this.property = property ;
		this.sides = sides;
	}
	Shape (int sides){

		this.sides = sides;
	}

}
