// creating a class

// class is a blueprint for creating objects with similar properties and methods

// A method is a block of code which gets executed when called. It is also known as a function. Must be declared within a class.


public class Car {
     private String color;
     private int speed;

     public Car(String color){
          this.color = color;
     }

     public void setSpeed(int speed) {
          if(speed < 0){
               System.out.println("Not Possible");
          }else{
               this.speed = speed;
               System.out.println("Driving at " + speed);
          }
     }
}

