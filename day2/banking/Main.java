import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Total_amount =7000;
		System.out.println("Enter 1 for creating an account: ");
		System.out.println("Enter 2 to view balance: ");
		System.out.println("Enter 3 to withdraw money: ");
		System.out.println("Enter 4 to Deposit money: ");
		String name="",add="",fname="",bloc="";
		long pno=0;
		int c = sc.nextInt();
		switch(c) {
		case 1 :
			System.out.println("Enter Your name: ");
			name=sc.next();
			System.out.println("Enter Your Address: ");
			add=sc.next();
			System.out.println("Enter Your Father name: ");
			fname=sc.next();
			System.out.println("Enter Your bank location: ");
			bloc=sc.next();
			System.out.println("Enter Your Phone number: ");
			pno= sc.nextInt();
		case 2 :
		    System.out.println("enter account number:");
            System.out.println("Balance in your account"Total_amount);
		}
	}
}
