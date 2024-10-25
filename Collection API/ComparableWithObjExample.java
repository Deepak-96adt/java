import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Student implements Comparable<Student>{
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

    public int compareTo(Student that){
        if (this.sAge > that.sAge) 
                    return 1;
                else
                    return -1;
    }
    
}

public class ComparableWithObjExample {
    public static void main(String[] args) {

        List<Student> num = new ArrayList<>();
        num.add(new Student("Deepak", 111, 26)); 
        num.add(new Student("Amit", 151, 21)); 
        num.add(new Student("Alok", 131, 23)); 
        num.add(new Student("deepesh", 122, 14)); 

        Collections.sort(num);

        for(Student stud : num)
            System.out.println(stud);
        
    }
}
