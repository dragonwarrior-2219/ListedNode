class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {

    static int search(Node head, int key) {

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

    static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int key = 30;

        int result = search(head, key);

        if (result != -1) {
            System.out.println("Element found at position: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
