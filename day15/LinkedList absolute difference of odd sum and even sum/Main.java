import java.util.Scanner;
class ListNode {
	int data;
	ListNode next;
	ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
class LinkedList {
	ListNode head;
	void traversal() {
		if(head==null) {
			System.out.println("LinkedList is Empty");
			return;
		}
		else {
			ListNode temp = head;
			while(temp!=null) {
				System.out.print(+temp.data+"-->");
				temp=temp.next;
			}
		}
	}

	void insert_at_begin(int data) {
		ListNode newnode = new ListNode(data);
		if(head==null) {
			head=newnode;
			return ;
		}
		newnode.next=head;
		head=newnode;
	}
	int sum(){
	    ListNode odd = head;
	    ListNode even = head.next;
	    int odd_sum=0;
	    int even_sum=0;
	    while(even!=null && even.next!=null){
	        odd_sum+=odd.data;
	        odd=even.next;
	        even_sum+=even.data;
	        even=odd.next;
	    }
	    if(odd!=null){
	       odd_sum+=odd.data;
	    }
	    if(even!=null){
	        even_sum+=even.data;
	    }
	    return Math.abs(odd_sum-even_sum);
	}
}
public class Main{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        LinkedList ob = new LinkedList();
        ob.insert_at_begin(1);
        ob.insert_at_begin(2);
        ob.insert_at_begin(3);
        ob.insert_at_begin(4);
        ob.insert_at_begin(5);
        // ob.insert_at_begin(6);
        // ob.insert_at_begin(7);
        // ob.insert_at_begin(8);
        ob.traversal();
        System.out.println(ob.sum());
        
    }
}