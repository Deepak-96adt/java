public class Student{
	static String name ;
	static int rollNum;
	static double percentage;

	public void talk(){
		System.out.println("My name is : "+name);
		System.out.println("My roll number is : "+rollNum);
		System.out.println("My percentage is : "+percentage);
	}

	public static void main(String args[]){
		Student Deepak = new Student();
		// talk();

		Deepak.name = "Deepak upadhyay";
		Deepak.rollNum = 102;
		Deepak.percentage = 97.3;

		Deepak.talk();
	}
}