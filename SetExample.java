import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Red");
        set.add("Green");
        set.add("Blue");

        if (set.contains("Green")) {
            set.remove("Green");
            set.add("Yellow");
        }

        set.remove("Red");

        System.out.println("--- Set Traversal ---");
        for (String color : set) {
            System.out.println(color);
        }
    }
}