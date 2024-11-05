class Vehicle1 {
    public void start(){
        System.out.println("Vehicle starts.....");
    }
    public void haveWheels(){
        System.out.println("Vehicle have wheels.....");
    }
}

class Car1 extends Vehicle1{
    public void haveSeat(){
        System.out.println("Car have Seat.....");
    }
}

class Bike1 extends Car1{
    public void havekick(){
        System.out.println("bike have kick");
    }
}
 
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Bike1 myBike = new Bike1();
        myBike.start();
        myBike.haveWheels();
        myBike.haveSeat();
        myBike.havekick();
    }
}