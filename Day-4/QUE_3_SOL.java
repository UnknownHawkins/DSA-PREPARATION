// Vehicle Management System
// Problem Statment:-
// Create a class vehicle containing:
// brand name 
// maximum speed
// Create a chile class Car containing:
// fuel type
// Display complete vehicle information.


class Vehicle{
    String brand_Name;
    int Max_speed;
}
class Car extends Vehicle{
    String fuel_type;
    void displayInfo() {
        System.out.println("Brand Name: " + brand_Name);
        System.out.println("Maximum Speed: " + Max_speed);
        System.out.println("Fuel Type: " + fuel_type);
    }
}
public class QUE_3_SOL {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand_Name = "Toyota";
        car.Max_speed = 180;
        car.fuel_type = "Petrol";
        car.displayInfo();
    }
}