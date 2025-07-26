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
	    Set<String> set = new HashSet<>();
	    //add(Element)
	    set.add("Apple");
	    set.add("Banana");
	    set.add("Cherry");
	    set.add("Apple"); //Duplicates are ignored
	    System.out.println("After add(): "+set);
	    
	    //remove(object 0)
	    set.remove("Banana");
	    System.out.println("Removed Banana: "+set);
	    
	    //contains(Object o)
	    boolean hasApple = set.contains("Apple");
	    System.out.println("contains 'Apple'"+hasApple);
	    
	    //iterator()
	    System.out.println("Iterating with Iterator: ");
	    Iterator<String> it = set.iterator();
	    while(it.hasNext()){
	        System.out.println(it.next()+" ");
	    }
	    System.out.println();
	    
	    //toArray()
	    Object[] array = set.toArray();
	    System.out.print("Array Version:");
	    for(Object obj : array){
	        System.out.println(obj+" ");
	    }
	    System.out.println();
	}
}
