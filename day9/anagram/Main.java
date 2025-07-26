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
		String str = sc.next();
		String str1 =sc.next();
		char[] ch = str.toCharArray();
		char[] ch1 = str1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		str = new String(ch);
		str1 = new String(ch1);
		System.out.println(str.equals(str1));
	}
}
