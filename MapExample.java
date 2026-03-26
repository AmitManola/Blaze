// insertion,deletion,traverse,updation
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        map.put(2, "Blueberry");
        map.replace(3, "Coconut");

        map.remove(1);

        System.out.println("--- Map Traversal ---");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
//wap to insert element in linked list through user input print all the unique element in the linked list using map 