import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();

        sortedSet.add("Charlie");
        sortedSet.add("Alpha");
        sortedSet.add("Bravo");

        sortedSet.remove("Bravo");
        sortedSet.add("Beta");

        sortedSet.remove("Charlie");

        System.out.println("--- SortedSet Traversal ---");
        for (String name : sortedSet) {
            System.out.println(name);
        }
    }
}