import java.util.Scanner;
class ListNode{
  int data;
  ListNode next;
  ListNode(int data){
    this.data=data;
    this.next=null;
  }
}
class LinkedList{
  ListNode head;
  void traversal(){
    if(head==null){
      System.out.println("LinkedList is Empty");
      return;
    }
    else{
    ListNode temp = head;
    while(temp!=null){
      System.out.print(+temp.data+"-->");
      temp=temp.next;
    }
  }
}

void insert_at_begin(int data){
  ListNode newnode = new ListNode(data);
  if(head==null){
    head=newnode;
    return ;
  }
  newnode.next=head;
  head=newnode;
}
void insert_at_end(int data){
  ListNode newnode = new ListNode(data);
  if(head==null){
    head=newnode;
    return ;
  }
  ListNode temp= head;
  while(temp.next!=null){
    temp=temp.next;
  }
  temp.next=newnode;
}
void delete_at_end(){
  if(head==null){
    System.out.println("LinkedList is Empty");
    return;
  }
  if(head.next==null){
    head=null;
    return;
  }
  ListNode temp = head;
  while(temp.next.next!=null){
    temp=temp.next;
  }
  temp.next=null;
}
void insert_at_position(int pos, int data) {
    ListNode newnode = new ListNode(data);
    if (pos <= 1 || head == null) {
        // Insert at the beginning if pos is 1 or list is empty
        newnode.next = head;
        head = newnode;
        return;
    }
    ListNode temp = head;
    int cur_pos = 1;
    // Traverse to the node before the desired position
    while (temp != null && cur_pos < pos - 1) {
        temp = temp.next;
        cur_pos++;
    }
    if (temp == null) {
        // If position is beyond the current length, insert at end
        temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    } else {
        newnode.next = temp.next;
        temp.next = newnode;
    }
}
void delete_at_begin(){
    if(head==null){
        System.out.println("LinkedList is Empty");
        return;
    }
    ListNode temp=head;
    if(temp.next!=null){
        head=temp.next;
    }
}
}
public class Main{
  public static void main(String[] args){
    LinkedList ob = new LinkedList();
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("Enter 1 to insert at begin");
      System.out.println("Enter 2 to insert at end");
      System.out.println("Enter 3 to delete at end");
      System.out.println("Enter 4 to insert at position");
      System.out.println("Enter 5 to delete at begin");
      System.out.println("Enter 6 to traverse the LinkedList");
      System.out.println("Enter 7 to exit");
      int choice = sc.nextInt();
      switch(choice){
        case 1:
          System.out.print("Enter data: ");
          int data1 = sc.nextInt();
          ob.insert_at_begin(data1);
          break;
        case 2:
          System.out.print("Enter data: ");
          int data2 = sc.nextInt();
          ob.insert_at_end(data2);
          break;
        case 3:
          ob.delete_at_end();
          break;
        case 4:
          System.out.print("Enter position and data: ");
          int pos = sc.nextInt();
          int data3 = sc.nextInt();
          ob.insert_at_position(pos, data3);
          break;
        case 5:
          ob.delete_at_begin();
          break;
        case 6:
          ob.traversal();
          break;
        case 7:
          sc.close();
          return;
        default:
          System.out.println("Invalid choice, please try again.");
      }
    }
  }
}