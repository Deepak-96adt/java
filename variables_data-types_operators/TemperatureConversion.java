import java.util.Scanner;

public class TemperatureConversion {

    // Method name changed to follow naming conventions
    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;  // Simplified calculation
    }

    public static void main(String[] args) {
        double fahrenheit;
        Scanner inputObj = new Scanner(System.in);

        // Exception handling to ensure valid input
        try {
            System.out.print("Enter the temperature in Fahrenheit: ");
            fahrenheit = inputObj.nextDouble();

            TemperatureConversion converter = new TemperatureConversion();
            System.out.printf("Converted into Celsius: %.2f%n", converter.toCelsius(fahrenheit));
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            inputObj.close();  // Ensure scanner is closed to avoid resource leak
        }
    }
}



/* import java.util.Scanner;

public class TemperatureConversion{
    
    public double convertIntoCelsius(double Fahrenheit){
	return ((Fahrenheit - 32) * 5/9);
    } 
	
    public static void main(String[] args){
	double fahrenheit;
	Scanner inputObj = new Scanner(System.in);
	System.out.print("Enter the fahrenheit : ");
	fahrenheit = inputObj.nextDouble();
	
	TemperatureConversion convert = new TemperatureConversion();

	System.out.println("Converted Into Celsius : "+convert.convertIntoCelsius(fahrenheit));
    }
}
*/