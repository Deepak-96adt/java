class Employee{
    int eId;
    String eName;
    float eRating; 
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.eId = 101;
        e1.eName = "rajesh";
        e1.eRating = 4.5f;

        Employee e2 = new Employee();
        e2.eId = 102;
        e2.eName = "ramesh";
        e2.eRating = 4.2f;

        Employee e3 = new Employee();
        e3.eId = 103;
        e3.eName = "rajnish";
        e3.eRating = 3.5f;

        Employee employee[] = new Employee[3];
        employee[0] = e1;
        employee[1] = e2;
        employee[2] = e3;

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].eName+" : "+employee[i].eRating);
        }

        System.out.println();
        System.out.println("with for Each loop start");
        for (Employee value : employee) {
            System.out.println(value.eName+" : "+value.eRating);
        }
    }
}
