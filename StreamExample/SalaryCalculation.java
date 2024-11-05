package StreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeStream {
     private double salary ; 
     private String name;
     private  int empId;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public EmployeeStream(int salary, String name, int empId) {
        this.salary = salary;
        this.name = name;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "EmployeeStream [salary=" + salary + ", name=" + name + ", empId=" + empId + "]";
    }
}

public class  SalaryCalculation{
public static void main (String args []){

    List<EmployeeStream>  empSalary = new ArrayList<>();
    empSalary.add(new EmployeeStream(12000, "Sanskriti",  26));
    empSalary.add(new EmployeeStream(11000, "sonu",  46));
    empSalary.add(new EmployeeStream(12500, "deepak",  45));
    empSalary.add(new EmployeeStream(16000, "shoaib",  20));
    empSalary.add(new EmployeeStream(19000, "vikalp",  10));
    empSalary.add(new EmployeeStream(9000, "aanand",  12));

    
    // empSalary.stream()
    // .filter(e->e.getSalary()>=10000 && e.getSalary()<=15000)
    // .map(e->{
    //     double a = e.getSalary()*1.10;
    //     String b = e.getName();
    //     return b+" = "+a;
    // }).forEach(e->System.out.println(e));


    List<EmployeeStream> empList = empSalary.stream()
    .filter(emp -> emp.getSalary() >= 10000 && emp.getSalary() <= 15000)
    .map(emp -> {
        emp.setSalary(emp.getSalary() * 1.2);
        return emp;
    })
    .collect(Collectors.toList());
    empList.forEach(System.out::println);

}

}