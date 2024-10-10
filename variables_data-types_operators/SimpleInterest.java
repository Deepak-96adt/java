import java.util.Scanner;

public class SimpleInterest {

    private double principalAmount;
    private double interestRate;
    private double timePeriod;

    // Method to set data
    public void setData(Scanner input) {
        System.out.print("Enter Principal Amount: ");
        this.principalAmount = validateInput(input);

        System.out.print("Enter Interest Rate (%): ");
        this.interestRate = validateInput(input);

        System.out.print("Enter Time Period (years): ");
        this.timePeriod = validateInput(input);
    }

    // Method to validate input
    private double validateInput(Scanner input) {
        double value = input.nextDouble();
        if (value <= 0) {
            throw new IllegalArgumentException("Value must be positive and non-zero.");
        }
        return value;
    }

    // Method to calculate Simple Interest
    public double calculateSimpleInterest() {
        return (this.principalAmount * this.interestRate * this.timePeriod) / 100;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            SimpleInterest sInterest = new SimpleInterest();
            sInterest.setData(input);
            double interest = sInterest.calculateSimpleInterest();
            System.out.println("Simple Interest: " + interest);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

















// import java.util.Scanner;

// /**
//  * SimpleInterest
//  */
// public class SimpleInterest{
    
//     int principal;
//     double rate;
//     double time;

//     public void setData(){
//         Scanner input = new Scanner(System.in);
//         try{
//             System.out.print("Enter Principal Amount : ");
//             this.principal = input.nextInt();
//             System.out.print("Enter Rate : ");
//             this.rate = input.nextDouble();
//             System.out.print("Enter Time : ");
//             this.time = input.nextDouble();
//         }
//         catch(Exception e){
//             System.out.println("Something went wrong with input !!!");
//         }
//         finally{
//             input.close();
//         }
//     }

//     public double calculateSI(){
//         return ((this.principal * this.rate * this.time) / 100);
//     }

//     public static void main (String[] args){
//         SimpleInterest sInterest = new SimpleInterest();
//         sInterest.setData();
//         double result = sInterest.calculateSI();
//         System.out.println("Simple Interest : "+result);
        
//     }
// }