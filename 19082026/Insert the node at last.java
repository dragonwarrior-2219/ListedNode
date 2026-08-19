class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head = null;

    // Insert at Last
    public void insertAtLast(int data) {
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

    // Traverse and Display
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

    // Search a Node
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
}

public class Main {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        System.out.println("Inserting Nodes at Last...");
        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtLast(40);
        list.insertAtLast(50);

        System.out.println("\nDisplaying Circular Linked List:");
        list.display();

        System.out.println("\nSearching Elements:");
        list.search(30);
        list.search(100);

        System.out.println("\nTotal Nodes: " + list.countNodes());
    }
}
