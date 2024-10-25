import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapHashMap {
    public static void main(String[] args) {
        Map<String,Integer> student = new HashMap<>();
        student.put("User1", 101);
        student.put("User2", 102);
        student.put("User3", 103);
        student.put("User4", 104);
        student.put("User2", 106);
        student.put("User5", 105);

        System.out.println(student);

        for (String key :  student.keySet()) {
            System.out.println(key+" : "+student.get(key));
        }
    }
}
