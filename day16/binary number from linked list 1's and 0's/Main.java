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

    void insert_at_end(int data) {
        ListNode newnode = new ListNode(data);
        if (head == null) {
            head = newnode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void traversal() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            ListNode temp = head;
            System.out.print("Linked List: ");
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    int Bin_value() {
        int res = 0;
        ListNode temp = head;
        while (temp != null) {
            res = res * 2 + temp.data;
            temp = temp.next;
        }
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ob = new LinkedList();
        int choice;

        while (true) {
            System.out.println("\n--- Linked List Menu ---");
            System.out.println("1. Insert at End");
            System.out.println("2. Binary Value of List");
            System.out.println("3. Traverse");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter 0 or 1 to insert: ");
                    int data = sc.nextInt();
                    if (data == 0 || data == 1) {
                        ob.insert_at_end(data);
                        System.out.println(data + " inserted.");
                    } else {
                        System.out.println("Only 0 or 1 allowed.");
                    }
                    break;

                case 2:
                    int binVal = ob.Bin_value();
                    System.out.println("Binary value: " + binVal);
                    break;

                case 3:
                    ob.traversal();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
