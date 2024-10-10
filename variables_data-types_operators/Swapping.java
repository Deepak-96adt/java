// program to swap the values of two variables without using a third variable.
import java.util.*;

public class Swapping {

    public void afterSwap(int num1 , int num2){
        num2=num1+num2;
        num1=num2-num1;
        num2=num2-num1;
        System.out.printf("After Swapping : num1 = %s , num2 = %s",num1,num2);
    
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter the First number : ");
            int num1 = input.nextInt();
            System.out.print("Enter the Second number : ");
            int num2 = input.nextInt();
            System.out.printf("Before Swapping : num1 = %s , num2 = %s \n",num1,num2);
            Swapping obj = new Swapping();
            obj.afterSwap(num1, num2);
        }catch(Exception inputException){
            System.out.println("Enter Correct Input");
        }finally{
            input.close();
        }
    }
}
