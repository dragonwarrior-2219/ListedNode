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

    // Search for an element
    public static int search(Node head, int key) {
        Node curr = head;
        int position = 1;

        while (curr != null) {
            if (curr.data == key) {
                return position;
            }
            curr = curr.next;
            position++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head = null;

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = insertEnd(head, data);
        }

        int key = sc.nextInt();

        int result = search(head, key);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position " + result);
        }

        sc.close();
    }
}
