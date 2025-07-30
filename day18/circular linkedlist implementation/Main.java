import java.util.Scanner;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    ListNode head;

    void traversal() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        ListNode temp = head;
        do {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    void insert_at_begin(int data) {
        ListNode newnode = new ListNode(data);
        if (head == null) {
            newnode.next = newnode;
            head = newnode;
            return;
        }
        ListNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newnode.next = head;
        temp.next = newnode;
        head = newnode;
    }

    void insert_at_end(int data) {
        ListNode newnode = new ListNode(data);
        if (head == null) {
            newnode.next = newnode;
            head = newnode;
            return;
        }
        ListNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = head;
    }

    void delete_at_begin() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        if (head.next == head) {
            head = null;
            System.out.println("List is now empty");
            return;
        }
        ListNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
    }

    void delete_at_end() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        if (head.next == head) {
            head = null;
            System.out.println("List is now empty");
            return;
        }
        ListNode temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList obj = new LinkedList();
        int choice, data;

        while (true) {
            System.out.println("\n--- Circular Linked List Menu ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete at Beginning");
            System.out.println("4. Delete at End");
            System.out.println("5. Traverse");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    obj.insert_at_begin(data);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    obj.insert_at_end(data);
                    break;
                case 3:
                    obj.delete_at_begin();
                    break;
                case 4:
                    obj.delete_at_end();
                    break;
                case 5:
                    obj.traversal();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
