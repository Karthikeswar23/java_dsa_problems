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
	int count(int data){
	    int cnt=0;
	    ListNode temp=head;
	    if(temp==null){
	        return 0;
	    }
	    while(temp!=null){
	        if(temp.data==data){
	            cnt+=1;
	        }
	        temp=temp.next;
	    }
	    return cnt;
	}
}
public class Main{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        LinkedList ob = new LinkedList();
        ob.insert_at_begin(1);
        ob.insert_at_begin(2);
        ob.insert_at_begin(2);
        ob.insert_at_begin(2);
        ob.insert_at_begin(2);
        ob.insert_at_begin(4);
        System.out.println(ob.count(2));
        ob.traversal();
        
    }
}