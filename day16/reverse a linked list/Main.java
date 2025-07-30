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

    void reverse() {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;   
            current.next = prev;   
            prev = current;        
            current = next;        
        }
        head = prev;
        System.out.println("Linked List reversed!");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert_at_end(1);
        list.insert_at_end(2);
        list.insert_at_end(3);
        list.insert_at_end(4);

        System.out.println("Original List:");
        list.traversal();

        list.reverse();

        System.out.println("Reversed List:");
        list.traversal();
    }
}
