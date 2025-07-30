/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class ListNode {
	int coeff;
	int exp;
	ListNode next;
	ListNode(int coeff,int exp) {
		this.coeff=coeff;
		this.exp=exp;
		this.next=null;
	}
}
class LinkedList {
	ListNode head;
	void display_polynomial() {
		if(head==null) {
			System.out.println("0");
			return;
		}
		if(head.coeff==0) {
			head=head.next;
		}
		ListNode temp=head;
		while(temp!=null) {
			if(temp.coeff!=0) {
				if(temp.coeff>0 && temp!=head) {
					System.out.print("+");
				}
				System.out.print(temp.coeff+""+(temp.exp==0? "":temp.exp==1? "X":"X^"+temp.exp));
			}
			temp=temp.next;
		}
	}
	void insert_term(int coeff,int exp) {
		ListNode newnode = new ListNode(coeff,exp);
		if(head==null || head.exp<exp) {
			newnode.next=head;
			head=newnode;
			return;
		}
		ListNode temp = head;
		while(temp.next!=null && temp.next.exp>=exp) {
			temp=temp.next;
		}
		newnode.next=temp.next;
		temp.next=newnode;
	}
}
public class Main
{
	public static void main(String[] args) {
		LinkedList obj = new LinkedList();
		obj.display_polynomial();
		obj.insert_term(-2,2);
		obj.insert_term(4,1);
		obj.insert_term(6,0);
		obj.display_polynomial();
		LinkedList obj1 = new LinkedList();
		obj1.insert_term(2,2);
		obj1.insert_term(4,1);
		obj1.insert_term(1,0);
		System.out.println();
		obj1.display_polynomial();
		System.out.println("\nSubtraction");
		sub_polynomials(obj,obj1);
		System.out.println("\nAddition:");
		add_polynomials(obj,obj1);
	}
	static void add_polynomials(LinkedList obj,LinkedList obj1) {
		LinkedList res = new LinkedList();
		ListNode p1=obj.head,p2=obj1.head;
		int sum=0;
		while(p1!=null && p2!=null) {
			if(p1.exp==p2.exp) {
				sum=p1.coeff+p2.coeff;
				res.insert_term(sum,p1.exp);
				p1=p1.next;
				p2=p2.next;
			}
			else if (p1.exp>p2.exp) {
				res.insert_term(p1.coeff,p1.exp);
				p1=p1.next;
			}
			else {
				res.insert_term(p2.coeff,p2.exp);
				p2=p2.next;
			}
		}
		while(p1!=null) {
			res.insert_term(p1.coeff,p1.exp);
			p1=p1.next;
		}
		while(p2!=null) {
			res.insert_term(p2.coeff,p2.exp);
			p2=p2.next;
		}
		res.display_polynomial();
	}
	static void sub_polynomials(LinkedList obj,LinkedList obj1) {
		LinkedList res = new LinkedList();
		ListNode p1=obj.head,p2=obj1.head;
		int sum=0;
		while(p1!=null && p2!=null) {
			if(p1.exp==p2.exp) {
				sum=p1.coeff-p2.coeff;
				res.insert_term(sum,p1.exp);
				p1=p1.next;
				p2=p2.next;
			}
			else if (p1.exp>p2.exp) {
				res.insert_term(p1.coeff,p1.exp);
				p1=p1.next;
			}
			else {
				res.insert_term(p2.coeff,p2.exp);
				p2=p2.next;
			}
		}
		while(p1!=null) {
			res.insert_term(p1.coeff,p1.exp);
			p1=p1.next;
		}
		while(p2!=null) {
			res.insert_term(p2.coeff,p2.exp);
			p2=p2.next;
		}
		res.display_polynomial();
	}
}