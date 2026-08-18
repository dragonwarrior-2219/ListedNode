import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Main {

    // Insert at end
    public static Node insertEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.prev = curr;

        return head;
    }

    // Forward Traversal
    public static void displayForward(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Reverse Traversal
    public static void displayReverse(Node head) {
        if (head == null) {
            return;
        }

        Node curr = head;

        // Move to last node
        while (curr.next != null) {
            curr = curr.next;
        }

        // Traverse backward
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head = null;

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = insertEnd(head, data);
        }

        System.out.println("Forward Traversal:");
        displayForward(head);

        System.out.println("Reverse Traversal:");
        displayReverse(head);

        sc.close();
    }
}
