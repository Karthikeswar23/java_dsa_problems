import java.util.*;

class Stack {
    int top = -1;
    int size;
    int[] stack;

    Stack(int size) {
        this.size = size;
        stack = new int[size];
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack is full! Can't push: " + data);
            return;
        }
        stack[++top] = data;
        System.out.println(data + " pushed to stack");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty! Nothing to pop.");
            return;
        }
        System.out.println("Popped: " + stack[top--]);
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty! No top element.");
            return -1;
        }
        return stack[top];
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        Stack obj = new Stack(size);

        while (true) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek (Top Element)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int data = sc.nextInt();
                    obj.push(data);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    int top = obj.peek();
                    if (top != -1) {
                        System.out.println("Top element: " + top);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
