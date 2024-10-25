import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListArrayList {    
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int random =(int) (Math.random()*10);
            num.add(random);
        }

        System.out.println(num);
        System.out.println("size : "+num.size());

        Iterator value = num.iterator();

        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}
