import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student{
    String sName;
    int sRollNum;
    int sAge;

    public Student(String sName, int sRollNum, int sAge) {
        this.sName = sName;
        this.sRollNum = sRollNum;
        this.sAge = sAge;
    }

    @Override
    public String toString() {
        return "Student [sName=" + sName + ", sRollNum=" + sRollNum + ", sAge=" + sAge + "]";
    }
}

public class ComparatorWithObjExample {
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j) {
                if (i.sAge > j.sAge) 
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> num = new ArrayList<>();
        num.add(new Student("Deepak", 111, 26)); 
        num.add(new Student("Amit", 151, 21)); 
        num.add(new Student("Alok", 131, 23)); 
        num.add(new Student("deepesh", 122, 14)); 

        Collections.sort(num,com);

        for(Student stud : num)
            System.out.println(stud);
        
    }
}
