class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;

    // Insert at End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Insert at Given Position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position <= 0) {
            System.out.println("Invalid Position");
            return;
        }

        // Insert at first position
        if (position == 1) {
            if (head == null) {
                head = newNode;
                newNode.next = head;
            } else {
                Node last = head;

                while (last.next != head) {
                    last = last.next;
                }

                newNode.next = head;
                head = newNode;
                last.next = head;
            }
            return;
        }

        Node temp = head;
        int count = 1;

        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println(data + " inserted at position " + position);
    }

    // Display List
    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is Empty");
            return;
        }

        Node temp = head;

        System.out.print("Circular Linked List: ");

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    // Count Nodes
    public int countNodes() {
        if (head == null)
            return 0;

        int count = 0;
        Node temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    // Search Element
    public void search(int key) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;
        int pos = 1;

        do {
            if (temp.data == key) {
                System.out.println(key + " found at position " + pos);
                return;
            }

            temp = temp.next;
            pos++;
        } while (temp != head);

        System.out.println(key + " not found");
    }
}

public class Main {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Original List:");
        list.display();

        list.insertAtPosition(25, 3);

        System.out.println("\nAfter Inserting 25 at Position 3:");
        list.display();

        list.insertAtPosition(5, 1);

        System.out.println("\nAfter Inserting 5 at Position 1:");
        list.display();

        System.out.println("\nTotal Nodes: " + list.countNodes());

        list.search(25);
    }
}
