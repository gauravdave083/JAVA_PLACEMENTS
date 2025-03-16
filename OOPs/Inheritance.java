// Inheritance is a fundamental object-oriented programming concept where a class (subclass or child class) inherits properties and behaviors (methods and fields) from another class (superclass or parent class), promoting code reusability and a hierarchical class structure

// Single Inheritance:
// A class inherits from only one parent class. 
// Example: class Dog extends Animal {} 

class Vehicle {
    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    void show() {
        System.out.println("This is a car");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();  // Parent class method
        car.show();     // Child class method
    }
}

// Multilevel Inheritance:
// A class inherits from a class, which in turn inherits from another class, creating a chain of inheritance. 
// Example: class Dog extends Animal {} and class Puppy extends Dog {} 

// JAVA DOESN'T SUPPORT MULTIPLE INHERITANCE

class Vehicle {
    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    void show() {
        System.out.println("This is a car");
    }
}

class ElectricCar extends Car {
    void battery() {
        System.out.println("This is an electric car");
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.display(); // Grandparent class
        tesla.show();    // Parent class
        tesla.battery(); // Child class
    }
}

// Hierarchical Inheritance:
// A single parent class is extended by multiple child classes, creating a tree-like structure. 
// Example: class Animal {} and class Dog extends Animal {}, class Cat extends Animal {} 

class Vehicle {
    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    void show() {
        System.out.println("This is a car");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("This is a bike");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
        car.show();

        Bike bike = new Bike();
        bike.display();
        bike.ride();
    }
}
