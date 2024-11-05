package StreamExample;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamExampleMain {
    public static void main(String args[]) {
        ArrayList<Integer> empArrayList = new ArrayList<>();
        empArrayList.add(24);
        empArrayList.add(68);
        empArrayList.add(54);
        empArrayList.add(32);
        empArrayList.add(100);
        empArrayList.add(30);
        
        Stream<Integer> stream = Stream.of(3,5,7,9,4,8);
        stream.filter(e->e%2==0).forEach(e->System.out.println(e));

            
        
        // System.out.println(empArrayList);
        for (Integer integer : empArrayList) {
            // System.out.println(integer);
        }
        Stream a = (empArrayList.stream().filter(e -> e > 50));
        // a.forEach(e -> System.out.println(e));

    }
}
