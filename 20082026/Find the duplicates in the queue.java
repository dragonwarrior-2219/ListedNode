import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(20);
        queue.add(40);
        queue.add(10);
        queue.add(50);

        System.out.println("Queue: " + queue);

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int value : queue) {
            if (!seen.add(value)) {
                duplicates.add(value);
            }
        }

        System.out.println("Duplicate Elements: " + duplicates);
    }
}
