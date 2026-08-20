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
        queue.add(20);

        System.out.println("Queue: " + queue);

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int value : queue) {
            if (count.containsKey(value)) {
                count.put(value, count.get(value) + 1);
            } else {
                count.put(value, 1);
            }
        }

        System.out.println("Number of repetitions:");

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(
                    entry.getKey() + " repeated " + entry.getValue() + " times"
                );
            }
        }
    }
}
