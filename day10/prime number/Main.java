/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int n=20,t=2,flag=0;
	    while(t<n && t>1){
	        if(n%t==0){
	            flag=0;
	            break;
	        }
	        else {
	            flag=1;
	        }
	        t++;
	    }
	    if(flag==0){
	        System.out.println("Not a prime");
	    }
	    else System.out.println("prime");
	}
}
