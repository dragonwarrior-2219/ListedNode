import java.util.*;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Original Stack: " + stack);

        Stack<Integer> reverseStack = new Stack<>();

        while (!stack.isEmpty()) {
            reverseStack.push(stack.pop());
        }

        System.out.println("Reversed Stack: " + reverseStack);
    }
}
