import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayList {    
    public static void main(String[] args) {
        Collection<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int random =(int) (Math.random()*10);
            num.add(random);
        }

        System.out.println(num);
        System.out.println(num.size());

        Iterator value = num.iterator();
        while (value.next()!= null) {
            System.out.println(value.next());
        }
    }
}
