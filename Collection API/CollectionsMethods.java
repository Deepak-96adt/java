import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {    
    public static void main(String[] args) {
        List<String> myString = new ArrayList<>();
        myString.add("azbc");
        myString.add("awekj");
        myString.add("xyz");
        myString.add("jugopk");
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);

        Collections.sort(myString);
        System.out.println(myString);
        int count = Collections.frequency(myString, "xyz");
        System.out.println(count);
        Collections.fill(myString, "Unknown");
        System.out.println(myString);
        
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);
        int min = Collections.min(numbers);
        System.out.println("min : "+min);
        int max = Collections.max(numbers);
        System.out.println("max : "+max);
        System.out.println(numbers);
        int index = Collections.binarySearch(numbers, 4);
        System.out.println(index);

        
    }
}
