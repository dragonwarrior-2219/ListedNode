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
    private Node tail;

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    // Insert at End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Insert at Start
    public void insertAtStart(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    // Delete Node
    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        Node prev = tail;

        do {
            if (curr.data == key) {

                // Only one node
                if (head == tail) {
                    head = null;
                    tail = null;
                }
                // Delete head
                else if (curr == head) {
                    head = head.next;
                    tail.next = head;
                }
                // Delete tail
                else if (curr == tail) {
                    prev.next = head;
                    tail = prev;
                }
                // Delete middle node
                else {
                    prev.next = curr.next;
                }

                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Node not found");
    }

    // Search Node
    public boolean search(int key) {
        if (head == null) {
            return false;
        }

        Node temp = head;

        do {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        } while (temp != head);

        return false;
    }

    // Count Nodes
    public int countNodes() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        Node temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    // Display List
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
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
}

public class Main {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        // Insert at End
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        // Insert at Start
        list.insertAtStart(5);
        list.insertAtStart(1);

        System.out.println("After Insertions:");
        list.printList();

        // Search
        System.out.println("Search 20: " + list.search(20));
        System.out.println("Search 100: " + list.search(100));

        // Count
        System.out.println("Total Nodes: " + list.countNodes());

        // Delete
        list.delete(20);
        System.out.println("After Deleting 20:");
        list.printList();

        list.delete(1);
        System.out.println("After Deleting 1:");
        list.printList();

        list.delete(30);
        System.out.println("After Deleting 30:");
        list.printList();
    }
}
