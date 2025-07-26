/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> num = new ArrayList<>();
	    // add() -Adding Elements
	    num.add(10);
	    num.add(20);
	    num.add(30);
	    System.out.println("Initial List: "+num);
	    
	    //add(index,element) - insert at index
	    num.add(1,15);
	    System.out.println("After Inserting 15 at 1: "+num);
	    
	    //get(index)
	    System.out.println("Number at index 2: "+num.get(2));
	    
	    //set(index,element)
	    num.set(2,25);
	    System.out.println("After replacing 25 at 2: "+num);
	    
	    //remove(index)
	    num.remove(0);
	    System.out.println("After Removing element at index 0: "+num);
	    
	    num.add(10);
	    num.add(10);
	    num.add(30);
	    System.out.println("Initial List: "+num);
	    
	    //remove(object)
	    num.remove(Integer.valueOf(10));
	    System.out.println("After removing the value 10: "+num);
	    
	    //contains()
	    System.out.println("Contains 20: "+num.contains(20));
	    
	    //size()
	    System.out.println("size: "+num.size());
	    
	    //isEmpty()
	    System.out.println("isEmpty: "+num.isEmpty());
	    
	    //iterator()
	    System.out.println("Using Iterator");
	    Iterator<Integer> it = num.iterator();
	    while(it.hasNext()){
	        System.out.print(it.next()+" ");
	    }
	    System.out.println();
	    
	    //subList()
	    List<Integer> subList = num.subList(0,2);
	    System.out.println("subList(0,2)"+subList);
	    
	    //toArray()
	    Object[] arr = num.toArray();
	    System.out.println("Array: ");
	    for(Object obj:arr){
	        System.out.print(obj+" ");
	    }
	    
	    //clear()
	    num.clear();
	    System.out.println("\n After clear(): "+num);
	    
	}
}