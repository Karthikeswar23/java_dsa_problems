/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    StringBuilder sb = new StringBuilder("Karthik");
	    sb.append("Bezawada");
	    System.out.println("After Append: "+sb);
	    sb.insert(7,"eswar");
	    System.out.println("After Insert: "+sb);
	    sb.replace(0,12,"I'm");
	    System.out.println("After Replace: "+sb);
	    sb.delete(4,8);
	    System.out.println("After Delete: "+sb);
	    sb.reverse();
	    System.out.println("After Reverse: "+sb);
	    String finalstring=sb.toString();
	    System.out.println("Final string: "+finalstring);
	}
}
