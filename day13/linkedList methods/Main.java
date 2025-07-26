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
	    LinkedList<String> list = new LinkedList<>();
	    
	    //add - add elements
	    list.add("Apple");
	    list.add("Banana");
	    list.add("Orange");
	    System.out.println("Initial List: "+list);
	    
	    //add(index,element)
	    list.add(1,"cherry");
	    System.out.println("Add cherry at index 1: "+list);
	    
	    //addFirst() - Add element at the Start
        list.addFirst("mango");
        System.out.println("Adding Mango at Starting: "+list);
        
        //addLast() - add element at Last
        list.addLast("Lemon");
        System.out.println("Adding Mango at Starting: "+list);	
	    
	    //get(index)
	    System.out.println("Element at 3: "+list.get(3));
	    
	    //getFirst() & getLast()
	    System.out.println("First Element: "+list.getFirst());
	    System.out.println("Last Element: "+list.getLast());
	    
	    //set(index,element)
	    list.set(2,"pineapple");
	    System.out.println("Set Pineapple at 2: "+list);
	    
	    //remove(index)
	    list.remove(2);
	    System.out.println("Removed element at index 2: "+list);
	    
	    //remove(object)
	    list.remove("Banana");
	    System.out.println("Removed element Banana: "+list);
	    
	    //removeFirst() & removeLast()
	    list.removeFirst();
	    System.out.println("After Removing First"+list);
	    list.removeLast();
	    System.out.println("After Removing Last"+list);
	    
	    //contains(object)
	    System.out.println(list.contains("Apple"));
	    
	    //indexOf() & lastIndexOF()
	    list.add("Lemon");
	    System.out.println(list.indexOf("Lemon"));
	    System.out.println(list.lastIndexOf("Lemon"));
	    
	    //iterator()
	    System.out.println("Iterating using Iterator: ");
	    Iterator<String> it = list.iterator();
	    while(it.hasNext()){
	        System.out.println(it.next()+" ");
	    }
	    System.out.println();
	    
	    //descendingIterator()
	    System.out.println("Iterating in reverse order");
	    Iterator<String> descIt = list.descendingIterator();
	    while(descIt.hasNext()){
	        System.out.println(descIt.next()+" ");
	    }
	    System.out.println();
	    
	    //peek()
	    System.out.println("Peek (Head Element): "+list.peek());
	    
	    //poll()
	    System.out.println("poll (Removes head): "+list.poll());
	    System.out.println("After poll: "+list);
	    
	    //offer() ,offerFirst() ,offerLast()
	    list.offer("kiwi");
	    list.offerFirst("Guvava");
	    list.offerLast("watermelon");
	    System.out.println("After offer operations: "+list);
	    
	    //toArray()
	    Object[] arr = list.toArray();
	    System.out.println("Array version ");
	    for(Object obj : arr){
	        System.out.println(obj+" ");
	    }
	    System.out.println();
	    
	    //clear()
	    list.clear();
	    System.out.println("After clear(): "+list);
	}
}
