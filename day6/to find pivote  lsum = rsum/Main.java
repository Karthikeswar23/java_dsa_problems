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
		int n = sc.nextInt();
		int[] a = new int[n];
		int tsum=0;
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
			tsum+=a[i];
		}
		int lsum=0,flag=0;
		for(int i=0; i<n; i++) {
			if(lsum==tsum-lsum-a[i]) {
				System.out.print(i);
				flag=1;
				break;
			}
			lsum+=a[i];
		}
		if(flag==0) System.out.print("No pivote");
	}
}