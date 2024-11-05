import java.util.Scanner;

public class ComparisonNum {
    public String compareNumbers(int num1, int num2) {
        // Compare the two numbers and return the result
        if (num1 == num2) {
            return "Both numbers are equal";
        } else if (num1 > num2) {
            return "First number is greater";
        } else {
            return "Second number is greater";
        }
    }

    public static void main(String[] args) {
        // Create an object of ComparisonNum class
        ComparisonNum obj = new ComparisonNum();
        
        // Optionally, take input from the user instead of hardcoding
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Get the comparison result
        String result = obj.compareNumbers(num1, num2);
        
        // Print the result
        System.out.println(result);
        
        input.close(); // Close the scanner to avoid resource leak
    }
}






// import java.util.Scanner;

// public class ComparisonNum {
//     public String checkNum(int num1 , int num2){
//         if (num1==num2) {
//             return "Both Numbers are equal";
//         } else {
//             return "Numbers are not equal";
//         }
//     }
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter First number : ");
//         int num1 = input.nextInt();
//         System.out.println("Enter Second number : ");
//         int num2 = input.nextInt();
//         ComparisonNum obj = new ComparisonNum();
//         String result = obj.checkNum(num1, num2);
//         System.out.println(result);
//         input.close();
//     }    
// }
