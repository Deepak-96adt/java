class Vehicle2 {
    public void start(String vehicleType , String vehicleStartWith){
        System.out.println("My "+vehicleType+" Start with "+vehicleStartWith);
    }
    public void haveWheels(String vehicleType , int vehicleWheels){
        System.out.println("My "+vehicleType+" have "+vehicleWheels+" Wheels");
    }
}

class Car2 extends Vehicle2{
    public void dashboard(){
        System.out.println("Car have dashboard.....");
    }
}
 

class Bike2 extends Vehicle2{
    public void havekick(){
        System.out.println("Bike have kick.....");
    }
}

public class HierarchicalLevelInheritance {
    public static void main(String[] args) {
        Car2 myCar = new Car2();
        myCar.start("car" , "key");
        myCar.haveWheels("car",4);
        myCar.dashboard();
        
        Bike2 myBike = new Bike2();
        myBike.start("bike","kick");
        myBike.haveWheels("bike",2);
        myBike.havekick();
    }
}