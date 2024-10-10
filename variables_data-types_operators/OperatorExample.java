/**
 * This Java program performs the following operations: addition, subtraction, 
 * multiplication, division, and modulus on two integers and displays the results.
 */
class OperatorExample {
    
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (float) a / b;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        int a = 10, b = 3;
        OperatorExample example = new OperatorExample();
        System.out.println("Addition result: " + example.add(a, b));
        System.out.println("Subtraction result: " + example.subtract(a, b));
        System.out.println("Multiplication result: " + example.multiply(a, b));
        System.out.println("Division result: " + example.divide(a, b));
        System.out.println("Modulus result: " + example.modulus(a, b));
    }
}
