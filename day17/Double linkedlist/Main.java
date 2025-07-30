import java.util.Scanner;

class ListNode {
    int data;
    ListNode next, prev;

    ListNode(int data) {
        this.data = data;
    }
}

class DoublyLinkedList {
    ListNode head;

    void insertAtBegin(int data) {
        ListNode newNode = new ListNode(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    void insertAtPosition(int data, int pos) {
        if (pos <= 1 || head == null) {
            insertAtBegin(data);
            return;
        }
        ListNode newNode = new ListNode(data);
        ListNode temp = head;
        int cur = 1;
        while (cur < pos - 1 && temp.next != null) {
            temp = temp.next;
            cur++;
        }
        newNode.next = temp.next;
        if (temp.next != null)
            temp.next.prev = newNode;
        newNode.prev = temp;
        temp.next = newNode;
    }

    void deleteFromBegin() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
        if (head != null)
            head.prev = null;
    }

    void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        ListNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.prev.next = null;
    }

    void deleteFromPosition(int pos) {
        if (head == null || pos <= 1) {
            deleteFromBegin();
            return;
        }
        ListNode temp = head;
        int cur = 1;
        while (cur < pos && temp != null) {
            temp = temp.next;
            cur++;
        }
        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }
        if (temp.next != null)
            temp.next.prev = temp.prev;
        if (temp.prev != null)
            temp.prev.next = temp.next;
    }

    void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        ListNode temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void displayBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        ListNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        int choice, data, pos;

        do {
            System.out.println("\n------ Doubly Linked List Menu ------");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Specific Position");
            System.out.println("4. Delete from Beginning");
            System.out.println("5. Delete from End");
            System.out.println("6. Delete from Specific Position");
            System.out.println("7. Forward Traversal");
            System.out.println("8. Backward Traversal");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    dll.insertAtBegin(data);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    dll.insertAtEnd(data);
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    dll.insertAtPosition(data, pos);
                    break;
                case 4:
                    dll.deleteFromBegin();
                    break;
                case 5:
                    dll.deleteFromEnd();
                    break;
                case 6:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    dll.deleteFromPosition(pos);
                    break;
                case 7:
                    dll.displayForward();
                    break;
                case 8:
                    dll.displayBackward();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
