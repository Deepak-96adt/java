/**
 * This Java program declares variables and prints them to the console.
 */
class VariableExample {

    int number = 120;
    static float decimalNumber = 30.5f;
    boolean isConnected = true;

    public static void main(String[] args) {
        // Create an instance of the class to access instance variables
        VariableExample example = new VariableExample();

        // Print instance and static variables
        System.out.println("Number: " + example.number);
        System.out.println("Decimal Number: " + VariableExample.decimalNumber);
        System.out.println("Is Connected: " + example.isConnected);
    }
}
