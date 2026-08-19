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
    public void insert(int data) {
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

    // Delete Node at End
    public void deleteAtEnd() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        // Only one node
        if (head.next == head) {
            System.out.println("Deleted Node: " + head.data);
            head = null;
            return;
        }

        Node prev = null;
        Node curr = head;

        while (curr.next != head) {
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Deleted Node: " + curr.data);

        prev.next = head;
    }

    // Display List
    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
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

    // Search Node
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

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Original Circular Linked List:");
        list.display();

        System.out.println("\nDeleting Last Node...");
        list.deleteAtEnd();

        System.out.println("\nList After Deletion:");
        list.display();

        System.out.println("\nTotal Nodes: " + list.countNodes());

        System.out.println("\nSearching Element 30:");
        list.search(30);
    }
}
