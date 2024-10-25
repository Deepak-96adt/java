public class ThrowExample {
    
    // Method to validate age
    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older."); // Manually throwing an exception
        } else {
            System.out.println("You are eligible to vote!");
        }
    }
    
    public static void main(String[] args) {
        validateAge(16); // This will throw an exception
        System.out.println("End of program."); // This line will not be executed if exception occurs
    }
}
