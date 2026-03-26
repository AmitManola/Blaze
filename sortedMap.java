import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;

public class sortedMap{
    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        sortedMap.put(30, "Zebra");
        sortedMap.put(10, "Ape");
        sortedMap.put(20, "Lion");

        sortedMap.put(10, "Alligator");

        sortedMap.remove(30);

        System.out.println("--- SortedMap Traversal ---");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}