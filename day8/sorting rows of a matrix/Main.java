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
		int m = sc.nextInt();
		int[][] a= new int[n][m];
		for(int i =0; i<n; i++) {
			for(int j =0; j<m; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("output");
		for(int i =0; i<n; i++) {
			Arrays.sort(a[i]);
			System.out.println(Arrays.toString(a[i]));
		}
	}
}




