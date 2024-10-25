import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {

        // Comparator<Integer> com = new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer i, Integer j) {
        //         if (i%10>j%10) 
        //             return 1;
        //         else
        //             return -1;
        //     }
        // };

        Comparator<Integer> com = (i, j) -> i%10>j%10?1:-1;  

        List<Integer> num = new ArrayList<>();
        num.add(96); 
        num.add(33); 
        num.add(61); 
        num.add(29); 

        System.out.println(num);
        Collections.sort(num,com);
        System.out.println(num);
    }
}












        
        // new way of writing comparator with lembda function