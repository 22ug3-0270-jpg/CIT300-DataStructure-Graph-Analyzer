public class LinkedListOperations {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Inserted: " + value);
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.data == value) {
            head = head.next;
            System.out.println("Deleted: " + value);
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Value not found!");
            return;
        }
        temp.next = temp.next.next;
        System.out.println("Deleted: " + value);
    }

    public void search(int value) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == value) {
                System.out.println("Found at position: " + index);
                return;
            }
            temp = temp.next;
            index++;
        }
        System.out.println("Not found!");
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.print("Linked List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}