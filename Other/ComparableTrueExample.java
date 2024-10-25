import java.util.*;


class Employee implements Comparable<Employee>{

    String eName;
    int eId;
    float eSal;

    @Override
    public int compareTo(Employee o) {
        return this.eName.compareTo(o.eName);
    }

    public Employee(String eName, int eId, float eSal) {
        this.eName = eName;
        this.eId = eId;
        this.eSal = eSal;
    }

    @Override
    public String toString() {
        return "Employee [eName=" + eName + ", eId=" + eId + ", eSal=" + eSal + "]";
    }

}

public class ComparableTrueExample {
    public static void main(String[] args) {
        List<Employee> empArrayList = new ArrayList<>();
        empArrayList.add(new Employee("abc",101,3.5f));
        empArrayList.add(new Employee("qwe",123,21.5f));
        empArrayList.add(new Employee("xyz",134,2.15f));
        empArrayList.add(new Employee("pqr",162,24.5f));
        empArrayList.add(new Employee("lmn",139,7.35f));
        System.out.println(empArrayList);
        Collections.sort(empArrayList);

        System.out.println("________Sorting by name_________");
        for(Employee emp : empArrayList){
            System.out.println(emp);
        }

        // ArrayList<String> empArrayList = new ArrayList<>();
        // empArrayList.addAll(ArrayList);
    }
}
