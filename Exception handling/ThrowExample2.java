public class ThrowExample2 {
    public static void demo() {
        int age = 20;
        if (age < 18) {
            throw new RuntimeException("Age must be 18 or older."); // Manually throwing an exception
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        demo();
    }
}