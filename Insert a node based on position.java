class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {

    static Node insertPos(Node head, int pos, int val) {

        if (pos < 1)
            return head;

        // Insert at beginning
        if (pos == 1) {
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }

        Node curr = head;

        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null)
            return head;

        Node newNode = new Node(val);

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    static void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data);

            if (curr.next != null)
                System.out.print(" -> ");

            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);

        int val = 3;
        int pos = 3;

        head = insertPos(head, pos, val);

        printList(head);
    }
}
