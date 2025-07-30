import java.util.Scanner;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    ListNode top;

    void push(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed onto the stack.");
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Popped element: " + top.data);
            top = top.next;
        }
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int choice;

        while (true) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek (Top Element)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
