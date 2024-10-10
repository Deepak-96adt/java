class Vehicle {
    public void start(){
        System.out.println("Vehicle starts.....");
    }
    public void haveWheels(){
        System.out.println("Vehicle have wheels.....");
    }
}

class Car extends Vehicle{
    public void dashboard(){
        System.out.println("Car have dashboard.....");
    }
}
 
public class SingleInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.haveWheels();
        myCar.dashboard();
    }
}