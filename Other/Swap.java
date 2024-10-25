import java.io.*;

class Swapping{
    public static void main(String[] args){
        int num1 = 5 , num2 = 15;
        int temp;
        
        System.out.println("Before swap : num1 = "+num1+" , num2 = "+num2);

        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("after swap : num1 = "+num1+" , num2 = "+num2);
    }
}
