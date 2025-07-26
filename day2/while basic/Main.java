import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch ='y';
		while(ch == 'y') {
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a+b);
			System.out.println("enter y to continue again n to stop:");
			ch = sc.next().charAt(0);
		}
		System.out.println("Terminated!!");
	}
}