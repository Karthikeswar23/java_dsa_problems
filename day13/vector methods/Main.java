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
	    Vector<String> Vector = new Vector<>();
	    //add()
	    Vector.add("Apple");
	    Vector.add("Banana");
	    Vector.add("Cherry");
	    System.out.println("After add(): "+Vector);
	    
	    //add(index,elements)
	    Vector.add(1,"Mango");
	    System.out.println("After adding mango at index 1: "+Vector);
	    
	    //get(index)
	    System.out.println("element at index 3: "+Vector.get(3));
	    
	    //set(index,elements)
	    Vector.set(2,"Pineapple");
	    System.out.println("After set pinapple at 2: "+Vector);
	    
	    //remove(index)
	    Vector.remove("Apple");
	    System.out.println("After removing Apple: "+Vector);
	    
	    //contains(object)
	    System.out.println("contains banana"+Vector.contains("Banana"));
	    
	    //removeElementAt(2)
	    Vector.removeElementAt(2);
	    System.out.println("Removing element at 2: "+Vector);
	    
	    //size()
	    System.out.println("Size: "+Vector.size());
	    
	    //isEmpty()
	    System.out.println("isEmpty: "+Vector.isEmpty());
	    
	    //iterator()
	    System.out.println("Iterating using Iterator: ");
	    Iterator<String> it = Vector.iterator();
	    while(it.hasNext()){
	        System.out.println(it.next());
	    }
	    System.out.println();
	
	    //elements() - Enumeration
	    System.out.println("Iterating using Enumeration: ");
	    Enumeration<String> e = Vector.elements();
	    while(it.hasNext()){
	        System.out.println(e.nextElement()+" ");
	    }
	    System.out.println();
	}
}
