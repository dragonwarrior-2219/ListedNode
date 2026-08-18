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

    // Update node at a given position
    public static Node updateNode(Node head, int pos, int newValue) {
        if (head == null) {
            return null;
        }

        Node curr = head;
        int count = 1;

        while (curr != null && count < pos) {
            curr = curr.next;
            count++;
        }

        if (curr != null) {
            curr.data = newValue;
        }

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

        int pos = sc.nextInt();
        int newValue = sc.nextInt();

        head = updateNode(head, pos, newValue);

        display(head);

        sc.close();
    }
}
