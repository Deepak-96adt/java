import java.util.*;

public class ConvertSetToListExample {
    public static void main(String[] args) {
        Set<String> empTreeSet = new TreeSet<>();
        empTreeSet.add("a");
        empTreeSet.add("x");
        empTreeSet.add("w");
        empTreeSet.add("z");
        empTreeSet.add("a");
        ArrayList<String> empArrayList = new ArrayList<>();
        empArrayList.addAll(empTreeSet);
        empArrayList.add("r");
        empArrayList.add("q");
        empArrayList.add("o");
        Collections.sort(empArrayList);
        System.out.println(empTreeSet);
        System.out.println(empArrayList);
    }
}
