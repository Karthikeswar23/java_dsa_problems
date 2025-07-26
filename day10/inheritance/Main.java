/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    Snakes s = new snakes("poisionous","calm");
	    s = new snakes("poisinous");
	    s = new snakes();
	}
}
class Snakes{
    Snakes(String p,String c){
        System.out.println("Rattel snake"+" is "+p+" and "+c);
    }
    Snakes(String p){
        System.out.println("cobra"+" is "+p);
    }
    Snakes(){
        System.out.println("rat snake");
    }
    
}
class Humans extends Snakes{
    
}
