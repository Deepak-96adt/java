import java.io.*;

class AdditionClass{
	
	static int addTwoNumber(int num1 , int num2){
		return num1+num2;
	}
	
    public static void main(String[] args){
		 int num1 = 5;
		 int num2 = 15;
		 int add = addTwoNumber(num1,num2);
         
        System.out.println("Addition = "+(add));
    }
}

// class AdditionClass{
	
// 	static int addTwoNumber(int num1 , int num2){
// 		return num1+num2;
// 	}
// 	    //  int num1 = 5;
// 		//  int num2 = 15;
// 		static int add = addTwoNumber(5,3);
//     public static void main(String[] args){
//         System.out.println("Addition = "+(add));
//     }
// }
