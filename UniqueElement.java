import java.util.*;
class UniqueElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            list.add(element);
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        System.out.println("Unique elements in the linked list:");
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key);
            }
        }
        sc.close();
    }
}