import java.util.*;

class IdComparator implements Comparator<Employee2>{
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.eId-o2.eId;
    }
}

class NameComparator implements Comparator<Employee2>{
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.eName.compareTo(o2.eName);
    }
}

class SalComparator implements Comparator<Employee2>{
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.eSal > o2.eSal ? 1 : -1;
    }
}
class Employee2 {
    String eName;
    int eId;
    float eSal;

    public Employee2(String eName, int eId, float eSal) {
        this.eName = eName;
        this.eId = eId;
        this.eSal = eSal;
    }

    @Override
    public String toString() {
        return "Employee [eName=" + eName + ", eId=" + eId + ", eSal=" + eSal + "]";
    }

}

public class ComparatorTrueExample {
    public static void main(String[] args) {
        List<Employee2> empArrayList = new ArrayList<>();
        empArrayList.add(new Employee2("abc",101,3.5f));
        empArrayList.add(new Employee2("qwe",123,21.5f));
        empArrayList.add(new Employee2("xyz",134,2.15f));
        empArrayList.add(new Employee2("pqr",162,24.5f));
        empArrayList.add(new Employee2("lmn",139,7.35f));


        System.out.println("_________________ ID _____________________________");
        Collections.sort(empArrayList,new IdComparator());
        for(Employee2 emp : empArrayList){
            System.out.println(emp);
        }
        System.out.println("____________________ Name __________________________");
        Collections.sort(empArrayList,new NameComparator());
        for(Employee2 emp : empArrayList){
            System.out.println(emp);
        }
        System.out.println("____________________Sal _________________________");
        Collections.sort(empArrayList,new SalComparator());
        for(Employee2 emp : empArrayList){
            System.out.println(emp);
        }

    }
}
