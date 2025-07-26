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
	    Bank ob = new Bank();
	    Savings sa = new Savings();
	   // checking ca =new checking();
	    double bal=ob.bal,ir=5;
	   // System.out.println("1.deposit");
	   // System.out.println("2.withdraw");
	   // System.out.println("3.displayBalance");
	   // System.out.println("4.Intrest");
	    System.out.println("Savings account");
	    System.out.print("Balance ");
	    ob.viewbal(bal);
	    sa.addintrest(bal,ir);
	    System.out.println("Deposit ");
	    ob.deposit(bal,sc.nextInt());
	    System.out.println("Withdraw ");
	    ob.withdraw(bal,sc.nextInt());
	}
}
class Bank{
    double bal=2000;
    void deposit(double bal,double amt){
        bal+=amt;
        System.out.println(bal);
    }
    void withdraw(double bal,double amt){
        if(bal>=amt){
            bal-=amt;
            System.out.println("with draw successful and your available balance is "+bal);
        }
        else{
            System.out.println("Insufficient Funds withdraw unsuccessful");
        }
    }
    void viewbal(double bal){
        System.out.println("Your available bank balance is "+bal);
    }
}
class Savings extends Bank{
    double in=0,bal=1000;
    void addintrest(double bal,double ir){
        in = bal*ir/100;
        System.out.println("Total intrest for your balance amount is "+in);
    }
}
// class Checking extends Bank{
//     double overdraft,bal=2000;
//     checking(){
//     withdraw(od,amt);
// }







