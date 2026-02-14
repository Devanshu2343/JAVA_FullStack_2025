package OOPSmethodOverriding;


public class Solution{
    public static void main (String[] args){
    Vehicle v1 = new Car();
     v1.setBrand("Toyota");
     v1.setSpeed(120);

     System.out.println("Brand :" + v1.getBrand());
     System.out.println("Speed :" + v1.getSpeed());
     
     Car c1 = (Car)v1;
     c1.setModel("Innova");
     System.out.println("Model: " + c1.getModel());
   
     
     
    }
}
class Vehicle {
     private String brand ;
      private int speed ;
   
      public void setBrand(String brand){
         this.brand = brand;
     }
    public String getBrand(){
        return this.brand;

     }
     public void setSpeed(int speed){
        this.speed= speed;
     }
     public int getSpeed(){
        return this.speed;
   }

}

class Car extends Vehicle {
    private  String model ;
    Car(){

    }
   
     public void setModel(String model){
       this.model= model;
    }
    public String getModel(){
        return this.model;
     }

}

