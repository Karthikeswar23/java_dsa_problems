// /******************************************************************************

// Welcome to GDB Online.
// GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
// C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
// Code, Compile, Run and Debug online from anywhere in world.

// *******************************************************************************/
// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 	    Map<Integer,String> map = new HashMap<>();
	    
// 	    //put(K key,V value)
// 	    map.put(1,"Apple");
// 	    map.put(2,"Banana");
// 	    map.put(3,"Cherry");
// 	    System.out.println("After put(): "+map);
	    
// 	    //putAll(Map ,m)
// 	    Map<Integer ,String> anothermap = new HashMap<>();
// 	    anothermap.put(4,"Dates");
// 	    anothermap.put(5,"cashews");
// 	    map.putAll(anothermap);
// 	    System.out.println("After putAll(): "+map);
	    
// 	    //get(Object key)
// 	    System.out.println("get(2): "+map.get(2));
	    
// 	    //remove(Object key)
// 	    map.remove(3);
// 	    System.out.println("After remove(3): "+map);
	    
// 	    //containsKey(Object Key)
// 	    System.out.println("ContainsKey (1): "+map.containsKey(1));
	    
// 	    //containsValue(Object value)
// 	    System.out.println("containsValue ('Banana')"+map.containsValue("Banana"));
	    
// 	    //size()
// 	    System.out.println("size(): "+map.size());
	    
// 	    //isEmpty()
// 	    System.out.println("isEmpty(): "+map.isEmpty());
	    
// 	    //keySet()
// 	    Set<Integer> keys = map.keySet();
// 	    System.out.println("keySet(): "+keys);
	    
// 	    //values()
// 	    Collection<String> values = map.values();
// 	    System.out.println("values(): "+values);
	    
// 	    //emtrySet()
// 	    Set<Map.Entry<Integer,String>> entries = map.entrySet();
// 	    System.out.println("entrySet(): "+entries);
// 	    System.out.println("Iterating entrySet(): ");
// 	    for(Map.Entry<Integer,String> e : entries){
// 	        System.out.println("Key: "+e.getKey()+"Value: "+e.getValue());
// 	    }
	    
// 	    //replace(k key,v Value)
// 	    map.replace(2,"Orange");
// 	    System.out.println("After replacing 2 to orange: "+map);
	    
// 	    //clear()
// 	    map.clear();
// 	    System.out.println("After clear: "+map);
// 	    System.out.println("isEmpty() after class: "+map.isEmpty());
// 	}
// }

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<10;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(arr);
    }
}