class Car{
    String model;
    int price;

    public void setData(String model , int price){
        this.model=model;
        this.price=price;
    }

    public void display(){
        System.out.println("my car company is "+this.model+" and price is $"+this.price);
    }
}

public class MyObject {
    public static void main(String[] args) {
        Car deepakCar = new Car();
        deepakCar.setData("BMW", 50000);
        deepakCar.display();
    }
}
