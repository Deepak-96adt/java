// program to check whether a given number is even or odd.

import java.util.*;

public class NumberUtility {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        try {
            int number = input.nextInt();
            NumberUtility obj = new NumberUtility();
            System.out.println(number + " is " + (obj.isEven(number) ? "Even" : "Odd"));
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer.");
        } finally {
            input.close();  // Closing the resource properly
        }
    }
}





// import java.util.*;

// public class CheckEven {
//     public String isEven(int num){
//         if (num%2==0) {
//             return "Even Number";
//         }
//         else{
//             return "Odd Number";
//         }
//     }
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("enter the number : ");
//         int number = input.nextInt();
//         CheckEven obj = new CheckEven();
//         System.out.println(obj.isEven(number));
//         input.close();
//     }
// }
