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

    // Delete last node
    public static Node delLast(Node head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.prev.next = null;

        return head;
    }

    // Display list
    public static void display(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
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

        head = delLast(head);

        display(head);

        sc.close();
    }
}
