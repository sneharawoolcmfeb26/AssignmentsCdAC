/*Question 2: Design a Fleet Management System 
Requirements: 
● Base class: Vehicle 
● Derived classes: Car, Bike 
● System should: 
○ Track brand & speed 
○ Store fuel type / mileage 
● Use: 
○ Static block → system initialization 
○ Non-static block → object creation log 
● Allow: 
○ Updating vehicle speed 
● Display vehicle details */

class Vehicle{
    String brand;
    int speed;
    
    static {
        System.out.println("Fleet Management system started");
    }

    {
        System.out.println("Vechicle object Created");
    }
    
    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    //Update Speed
    void updateSpeed(int newSpeed){
        this.speed = newSpeed;
    }

    //Display
    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Speed:"+speed);
    }
}

class Car extends Vehicle{
    String fueltype;
    double mileage;

    Car(String brand, int speed, String fueltype, double mileage){
        super(brand, speed);  //calls parent constructor
        this.fueltype = fueltype;
        this.mileage = mileage;
    }

    void display(){
        super.display();
        System.out.println("FuelType: "+fueltype);
        System.out.println("Mileage: "+mileage);
    }
}

class Bike extends Vehicle{
    String fueltype;
    double mileage;

    Bike(String brand, int speed, String fueltype, double mileage){
        super(brand, speed);  //calls parent constructor
        this.fueltype = fueltype;
        this.mileage = mileage;
    }

     void display(){
        super.display();
        System.out.println("FuelType: "+fueltype);
        System.out.println("Mileage: "+mileage);
    }
    
}


public class FleetManagementSys {
    public static void main(String[] args) {
        Car c1 = new Car("Tata", 70, "Petrol", 20);

        Bike b1 = new Bike("Honda", 60, "Petrol", 50);

        c1.updateSpeed(100);
        b1.updateSpeed(80);

        System.out.println("\n--- Car Details ---");
        c1.display();

        System.out.println("\n--- Bike Details ---");
        b1.display();
    }
}
