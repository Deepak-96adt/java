import java.util.Scanner;
import java.util.Date;

class GreetingProgram {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        try (Scanner inputObj = new Scanner(System.in)) {
            Date date = new Date();

            System.out.println("Hello, World!");
            System.out.println("Current Time : "+date);

            // Prompt the user to enter their name
            System.out.print("Enter your name: ");
            String userInput = inputObj.nextLine();

            // Check if the input is not empty
            if (userInput.trim().isEmpty()) {
                System.out.println("You did not enter a valid name.");
            } else {
                System.out.printf("Your name is: %s", userInput);
            }
        } // The scanner is automatically closed here
    }
}



// import java.util.Scanner;

// class HelloWorld {
//     public static void main(String[] args){
// 	System.out.println("Hello world");


// 	Scanner inputObj = new Scanner(System.in);
// 	String userInput;

// 	System.out.print("Enter your name : ");
// 	userInput = inputObj.nextLine();
// 	System.out.print("Your name is : "+userInput);
//     }
// }