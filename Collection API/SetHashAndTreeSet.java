import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class SetHashAndTreeSet {    
    public static void main(String[] args) {
        Set <Integer>h_s_num = new HashSet<Integer>();
        
       h_s_num.add(12);
       h_s_num.add(32);
       h_s_num.add(62);
       h_s_num.add(12);
       h_s_num.add(2);

        System.out.println(h_s_num);
        System.out.println(h_s_num.size());

        
        Set <Integer>t_s_num = new TreeSet<Integer>();
        t_s_num.add(12);
        t_s_num.add(32);
        t_s_num.add(62);
        t_s_num.add(12);
        t_s_num.add(2);
 
         System.out.println(t_s_num);
         System.out.println(t_s_num.size());

         
    }
}
