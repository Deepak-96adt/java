class Calculator{
    public int addition(int a , int b){
        return a+b;
    }
    public int addition(int a , int b , int c){
        return a+b+c;
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
        Calculator myCal = new Calculator();
        System.out.println("addition with 2 args : "+myCal.addition(5, 10));
        System.out.println("addition with 3 args : "+myCal.addition(5, 10,15));
    }
}