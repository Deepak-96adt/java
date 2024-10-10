public class Employee{
    
    private String name;
    private int empId;
    private long salary;

    public void setData(String name , int empId , long salary){
        this.name=name;
        this.empId=empId;
        this.salary=salary;
    }

    public String getName(){
        return this.name;
    }
    public int getID(){
        return this.empId;
    }
    public long getSalary(){
        return this.salary;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setData("Employee1", 123, 12000);
        System.err.println("Employee name : "+emp1.getName());
        System.err.println("Employee Id : "+emp1.getID());
        System.err.println("Employee salary : "+emp1.getSalary());
    }
}