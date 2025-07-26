/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter id: ");
		long id = sc.nextLong();
		System.out.println("Enter no of units: ");
		int units=sc.nextInt();
		double bill=0;
		System.out.println("Customer name:"+name);
		System.out.println("Customer id"+id);
		System.out.println("Consumed units"+units);
		if (units < 0) System.out.println("Invalid units");
		else {
			if(units>=0 && units <=100) {
				bill = units*1.5;
				System.out.println("Base bill:"+bill);
			}
			else if(units>100 && units<=200) {
				bill =100*1.5 + (units-100)*2.0;
				System.out.println("Base bill:"+bill);
			}
			else if(units>200 && units <=300) {
				bill =100*1.5 + 100*2.0 + (units-200)*3.0;
				System.out.println("Base bill:"+bill);
			}
			else if(units>=301) {
				bill = 100*1.5 + 100*2.0 + 100*3.0+(units-300)*5.0;
				System.out.println("Base bill:"+bill);
			}
			else{
			    System.out.println("Invalid");
			}

		}
		double gst = bill*0.05;
		double serv =25;
		System.out.println("Gst (5%)"+gst);
		System.out.println("service charge: "+serv);
		double total = bill+gst+25;
		double dis =0;
		if (total > 500) {
			dis = total - bill*0.05;
			System.out.println("discount"+bill*0.05);
		}
		else{
		    System.out.println("No discount");
		}
		System.out.println("Total: "dis);
	}
}
